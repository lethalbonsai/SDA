package com.xhak.demo.service.impl;

import com.xhak.demo.dto.userDtos.CreateUserDTO;
import com.xhak.demo.dto.userDtos.ResponseUserDTO;
import com.xhak.demo.mapper.UserMapper;
import com.xhak.demo.repository.UserRepository;
import com.xhak.demo.service.UserService;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class UserServiceFromDB implements UserService {
    UserRepository userRepository;
    UserMapper userMapper;
    @Override
    public List<ResponseUserDTO> getAllUsers() {
        return null;
    }

    @Override
    public Optional<ResponseUserDTO> getUserById(Long id) {
        return Optional.empty();
    }

    @Override
    public Long createUser(CreateUserDTO createUserDTO) {
        return null;
    }

    @Override
    public CreateUserDTO updateUser(Long id, CreateUserDTO createUserDTO) {
        return null;
    }

    @Override
    public String deleteUser(Long id) {
        return null;
    }
}
