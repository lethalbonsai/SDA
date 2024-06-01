package com.xhak.demo.service;

import com.xhak.demo.dto.roleDtos.CreateRoleDTO;
import com.xhak.demo.dto.roleDtos.ResponseRoleDTO;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<ResponseRoleDTO> getAllRoles();
    Optional<ResponseRoleDTO> getRoleById(Long id);
    Long createRole(CreateRoleDTO createRoleDTO);
    CreateRoleDTO updateRole(CreateRoleDTO createRoleDTO);
    String deleteRole(Long id);
}
