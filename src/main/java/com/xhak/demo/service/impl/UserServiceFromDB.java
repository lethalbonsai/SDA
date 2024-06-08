package com.xhak.demo.service.impl;

import com.xhak.demo.dto.userDtos.CreateUserDTO;
import com.xhak.demo.dto.userDtos.ResponseUserDTO;
import com.xhak.demo.entities.UserEntity;
import com.xhak.demo.mapper.UserMapper;
import com.xhak.demo.repository.UserRepository;
import com.xhak.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserServiceFromDB implements UserService {
    UserRepository userRepository;
    UserMapper userMapper;
    @Override
    public List<ResponseUserDTO> getAllUsers() {
        List<UserEntity> userList = userRepository.findAll();
        List<ResponseUserDTO> responseUserDTOList = new ArrayList<>();
        for (UserEntity userEntity : userList) {
            responseUserDTOList.add(userMapper.toResponseUserDTO(userEntity));
        }
        return responseUserDTOList;
    }

    @Override
    public Optional<ResponseUserDTO> getUserById(Long id) {
        UserEntity foundUser = userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User with id: " + id + " was not found!"));
        return Optional.of(userMapper.toResponseUserDTO(foundUser));
    }

    @Override
    public Long createUser(CreateUserDTO createUserDTO) {
        UserEntity createUserEntity = userMapper.mapToUserEntity(createUserDTO);
        UserEntity savedUser = userRepository.save(createUserEntity);
        return savedUser.getId();
    }

    @Override
    public CreateUserDTO updateUser(Long id, CreateUserDTO createUserDTO) {
        UserEntity findUser = userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User with id: " + id + " was not found!"));
        userMapper.mapToUserEntity(createUserDTO);
        UserEntity updatedUser = userRepository.save(findUser);
        return userMapper.mapToCreateUserEntity(updatedUser);
    }

    @Override
    public String deleteUser(Long id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User with id: " + id + " was not found!"));
        userRepository.delete(userEntity);
        return "User with id: " + id + " was successfully deleted!";
    }
}
