package com.xhak.demo.service;

import com.xhak.demo.dto.addressDtos.CreateAddressDTO;
import com.xhak.demo.dto.userDtos.CreateUserDTO;
import com.xhak.demo.dto.userDtos.ResponseUserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<ResponseUserDTO> getAllUsers();
    Optional<ResponseUserDTO> getUserById(Long id);
    Long createUser(CreateUserDTO createUserDTO);
    CreateUserDTO updateUser(Long id, CreateUserDTO createUserDTO);
    String deleteUser(Long id);
}
