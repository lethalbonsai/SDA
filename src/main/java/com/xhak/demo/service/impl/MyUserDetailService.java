package com.xhak.demo.service.impl;

import com.xhak.demo.entities.UserEntity;
import com.xhak.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class MyUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
        Optional<UserEntity> foundUser = userRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail);
        if (!foundUser.isPresent()) {
            throw new UsernameNotFoundException("User not found");
        }
        return new MyUserDetails(foundUser.get());
    }
}
