package com.xhak.demo.service;

import com.xhak.demo.dto.addressDtos.CreateAddressDTO;
import com.xhak.demo.dto.userDtos.CreateUserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<CreateUserDTO> getAllUsers();
    Optional<CreateUserDTO> getUserById(Long id);
    Long createUser(CreateUserDTO createUserDTO);
    CreateUserDTO updateUser(Long id, CreateUserDTO createUserDTO);
    String deleteUser(Long id);
}
