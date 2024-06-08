package com.xhak.demo.service.impl;

import com.xhak.demo.dto.roleDtos.CreateRoleDTO;
import com.xhak.demo.dto.roleDtos.ResponseRoleDTO;
import com.xhak.demo.entities.AddressEntity;
import com.xhak.demo.entities.RoleEntity;
import com.xhak.demo.mapper.RoleMapper;
import com.xhak.demo.repository.RoleRepository;
import com.xhak.demo.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class RoleServiceFromDB implements RoleService {
    RoleRepository roleRepository;
    RoleMapper roleMapper;
    @Override
    public List<ResponseRoleDTO> getAllRoles() {
        List<RoleEntity> roleList = roleRepository.findAll();
        List<ResponseRoleDTO> responseRoleDTOList = new ArrayList<>();
        for (RoleEntity roleEntity : roleList) {
            responseRoleDTOList.add(roleMapper.mapToResponseRoleDTO(roleEntity));
        }
        return responseRoleDTOList;
    }

    @Override
    public Optional<ResponseRoleDTO> getRoleById(Long id) {
        RoleEntity foundRole = roleRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Role with id: " + id + " was not found!"));
        return Optional.of(roleMapper.mapToResponseRoleDTO(foundRole));
    }

    @Override
    public Long createRole(CreateRoleDTO createRoleDTO) {
        RoleEntity createRoleEntity = roleMapper.mapToRoleEntity(createRoleDTO);
        RoleEntity savedRole = roleRepository.save(createRoleEntity);
        return savedRole.getId();
    }

    @Override
    public CreateRoleDTO updateRole(Long id, CreateRoleDTO createRoleDTO) {
        RoleEntity findRole = roleRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Role with id: " + id + " was not found!"));
        roleMapper.mapToRoleEntity(createRoleDTO);
        RoleEntity updatedRole = roleRepository.save(findRole);
        return roleMapper.mapToCreateRoleDTO(updatedRole);
    }
    @Override
    public String deleteRole(Long id) {
        RoleEntity roleEntity = roleRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Role with id: " + id + " was not found!"));
        roleRepository.delete(roleEntity);
        return "Role with id: " + id + " was successfully deleted!";
    }
}
