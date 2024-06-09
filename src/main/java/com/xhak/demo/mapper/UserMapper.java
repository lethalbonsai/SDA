package com.xhak.demo.mapper;

import com.xhak.demo.dto.roleDtos.CreateRoleDTO;
import com.xhak.demo.dto.roleDtos.ResponseRoleDTO;
import com.xhak.demo.dto.userDtos.CreateUserDTO;
import com.xhak.demo.dto.userDtos.ResponseUserDTO;
import com.xhak.demo.entities.RoleEntity;
import com.xhak.demo.entities.UserEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


@AllArgsConstructor
@Component
public class UserMapper {
    private final RoleMapper roleMapper;
    public ResponseUserDTO toResponseUserDTO(UserEntity userEntity) {
        ResponseUserDTO responseUserDTO = new ResponseUserDTO();
        responseUserDTO.setId(userEntity.getId());
        responseUserDTO.setUsername(userEntity.getUsername());
        responseUserDTO.setEmail(userEntity.getEmail());
        responseUserDTO.setPassword(userEntity.getPassword());
        Set<RoleEntity> roles = userEntity.getRoles();
        responseUserDTO.setRoles(roles.stream().map(roleMapper::mapToResponseRoleDTO).collect(Collectors.toSet()));
        return new ResponseUserDTO();
    }

    public UserEntity mapToUserEntity(CreateUserDTO createUserDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(createUserDTO.getUsername());
        userEntity.setEmail(createUserDTO.getEmail());
        userEntity.setPassword(createUserDTO.getPassword());
        Set<CreateRoleDTO> roles = createUserDTO.getRoles();
        userEntity.setRoles(roles.stream().map(roleMapper::mapToRoleEntity).collect(Collectors.toSet()));

        return userEntity;
    }

    public CreateUserDTO mapToCreateUserEntity(UserEntity userEntity) {
        CreateUserDTO createUserDTO = new CreateUserDTO();
        createUserDTO.setUsername(userEntity.getUsername());
        createUserDTO.setEmail(userEntity.getEmail());
        createUserDTO.setPassword(userEntity.getPassword());
        Set<RoleEntity> roles = userEntity.getRoles();
        createUserDTO.setRoles(roles.stream().map(roleMapper::mapToCreateRoleDTO).collect(Collectors.toSet()));
        return createUserDTO;
    }
}
