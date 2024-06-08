package com.xhak.demo.mapper;

import com.xhak.demo.dto.roleDtos.CreateRoleDTO;
import com.xhak.demo.dto.roleDtos.ResponseRoleDTO;
import com.xhak.demo.entities.RoleEntity;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {
    public ResponseRoleDTO mapToResponseRoleDTO(RoleEntity roleEntity) {
        ResponseRoleDTO responseRoleDTO = new ResponseRoleDTO();
        responseRoleDTO.setId(roleEntity.getId());
        responseRoleDTO.setRoleName(roleEntity.getRoleName());
        return responseRoleDTO;
    }
    public RoleEntity mapToRoleEntity(CreateRoleDTO createRoleDTO) {
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setRoleName(createRoleDTO.getRoleName());
        return roleEntity;
    }
    public CreateRoleDTO mapToCreateRoleDTO(RoleEntity roleEntity) {
        CreateRoleDTO createRoleDTO = new CreateRoleDTO();
        createRoleDTO.setRoleName(roleEntity.getRoleName());
        return createRoleDTO;
    }
}
