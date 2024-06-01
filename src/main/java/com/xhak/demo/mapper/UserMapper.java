package com.xhak.demo.mapper;

import com.xhak.demo.dto.roleDtos.ResponseRoleDTO;
import com.xhak.demo.dto.userDtos.ResponseUserDTO;
import com.xhak.demo.entities.RoleEntity;
import com.xhak.demo.entities.UserEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.HashSet;
import java.util.Set;


@AllArgsConstructor
@Component
public class UserMapper {
    private final RoleMapper roleMapper;
    public ResponseUserDTO toResponseUserDTO(UserEntity userEntity) {
        ResponseUserDTO responseUserDTO = new ResponseUserDTO();
        responseUserDTO.setId(userEntity.getId());
        responseUserDTO.setFirstName(userEntity.getFirstName());
        responseUserDTO.setLastName(userEntity.getLastName());
        responseUserDTO.setUsername(userEntity.getUsername());
        responseUserDTO.setEmail(userEntity.getEmail());
        responseUserDTO.setPassword(userEntity.getPassword());
        Set<RoleEntity> roleEntities = userEntity.getRoles();
        Set<ResponseRoleDTO> roles = new HashSet<>();
        for (RoleEntity roleEntity : roleEntities) {
            roles.add(roleMapper.mapToResponseRoleDTO(roleEntity));
        }
        responseUserDTO.setRoles(roles);
//        Set<RoleEntity> roles = userEntity.getRoles();
//        responseUserDTO.setRoles(roles.stream().map(roleMapper::mapToResponseRoleDTO).collect(Collectors.toList()));
        return new ResponseUserDTO();
    }
}
