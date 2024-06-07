package com.xhak.demo.service.impl;

import com.xhak.demo.dto.roleDtos.CreateRoleDTO;
import com.xhak.demo.dto.roleDtos.ResponseRoleDTO;
import com.xhak.demo.mapper.RoleMapper;
import com.xhak.demo.repository.RoleRepository;
import com.xhak.demo.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class RoleServiceFromDB implements RoleService {
    RoleRepository roleRepository;
    RoleMapper roleMapper;
    @Override
    public List<ResponseRoleDTO> getAllRoles() {
        return null;
    }

    @Override
    public Optional<ResponseRoleDTO> getRoleById(Long id) {
        return Optional.empty();
    }

    @Override
    public Long createRole(CreateRoleDTO createRoleDTO) {
        return null;
    }

    @Override
    public CreateRoleDTO updateRole(Long id, CreateRoleDTO createRoleDTO) {
        return null;
    }
    public CreateRoleDTO updateRole(CreateRoleDTO createRoleDTO) {
        return null;
    }

    @Override
    public String deleteRole(Long id) {
        return null;
    }
}
