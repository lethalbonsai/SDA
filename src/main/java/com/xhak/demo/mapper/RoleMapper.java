package com.xhak.demo.mapper;

import com.xhak.demo.constant.Role;
import com.xhak.demo.dto.roleDtos.ResponseRoleDTO;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {
    public ResponseRoleDTO toResponseRoleDTO(Role role) {
        ResponseRoleDTO responseRoleDTO = new ResponseRoleDTO();
        responseRoleDTO.setId(role.getId());
        return new ResponseRoleDTO();
    }
}
