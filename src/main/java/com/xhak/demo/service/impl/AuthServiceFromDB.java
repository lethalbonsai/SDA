package com.xhak.demo.service.impl;

import com.xhak.demo.dto.payload.LogInDTO;
import com.xhak.demo.repository.RoleRepository;
import com.xhak.demo.repository.UserRepository;
import com.xhak.demo.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AuthServiceFromDB implements AuthService{
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;


    private  AuthenticationManager authenticationManager;

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
}