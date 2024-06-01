package com.xhak.demo.mapper;

import com.xhak.demo.dto.roleDtos.ResponseRoleDTO;
import com.xhak.demo.entities.RoleEntity;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {
    public ResponseRoleDTO toResponseRoleDTO(RoleEntity roleEntity) {
        ResponseRoleDTO responseRoleDTO = new ResponseRoleDTO();
        responseRoleDTO.setId(roleEntity.getId());
        responseRoleDTO.setRoleName(roleEntity.getRoleName());

        return new ResponseRoleDTO();
    }
}
