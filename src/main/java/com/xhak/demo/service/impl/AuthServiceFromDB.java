package com.xhak.demo.service.impl;

import com.xhak.demo.dto.payload.LogInDTO;
import com.xhak.demo.dto.payload.RegisterEmployeeDTO;
import com.xhak.demo.entities.AddressEntity;
import com.xhak.demo.entities.ClientEntity;
import com.xhak.demo.entities.RoleEntity;
import com.xhak.demo.entities.UserEntity;
import com.xhak.demo.repository.AddressRepository;
import com.xhak.demo.repository.ClientRepository;
import com.xhak.demo.repository.RoleRepository;
import com.xhak.demo.repository.UserRepository;
import com.xhak.demo.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class AuthServiceFromDB implements AuthService{
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private  AuthenticationManager authenticationManager;
    private PasswordEncoder passwordEncoder;
    private AddressRepository addressRepository;
    private ClientRepository clientRepository;

    @Override
    public String accountLogin(LogInDTO logInDTO) {
        String usernameOrEmail;
        if (logInDTO.getUsername() != null) {
            usernameOrEmail = logInDTO.getUsername();
        } else if (logInDTO.getEmail() != null) {
            usernameOrEmail = logInDTO.getEmail();
        }else {
            throw new RuntimeException("Username or email is required!");
        }

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(usernameOrEmail, logInDTO.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return "User with username: " + usernameOrEmail + " was successfully logged in!";
    }

    @Override
    public String registerAccount(RegisterEmployeeDTO registerEmployeeDTO) {
        if (Boolean.TRUE.equals(userRepository.existsByUsernameOrEmail(registerEmployeeDTO.getUsername(),registerEmployeeDTO.getEmail()))){
            return "User already exists!";
        }

        UserEntity newUser = new UserEntity();
        newUser.setUsername(registerEmployeeDTO.getUsername());
        newUser.setEmail(registerEmployeeDTO.getEmail());
        newUser.setPassword(passwordEncoder.encode(registerEmployeeDTO.getPassword()));
        Set<RoleEntity> roles = new HashSet<>();
        roles.add(roleRepository.findByRoleName("ROLE_USER").orElseThrow(() -> new RuntimeException("Role not found!")));
        newUser.setRoles(roles);

        ClientEntity newClient = new ClientEntity();
        newClient.setFirstName(registerEmployeeDTO.getFirstName());
        newClient.setLastName(registerEmployeeDTO.getLastName());
        newClient.setPhoneNumber(registerEmployeeDTO.getPhoneNumber());

        List<AddressEntity> addresses = new ArrayList<>();
        for (AddressEntity address : registerEmployeeDTO.getAddressList()) {
            address.setClient(newClient);
            addresses.add(address);
        }
        newClient.setAddresses(addresses);

        clientRepository.save(newClient);
        newUser.setClient(newClient);
        userRepository.save(newUser);

        return "User Registered Successfully!";
    }


}