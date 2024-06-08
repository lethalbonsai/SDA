package com.xhak.demo.controllers;

import com.xhak.demo.dto.roleDtos.CreateRoleDTO;
import com.xhak.demo.dto.roleDtos.ResponseRoleDTO;
import com.xhak.demo.service.RoleService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/role")
public class RoleController {
    private RoleService roleService;

    @GetMapping("{id}")
    public ResponseEntity<ResponseRoleDTO> getRoleById(@PathVariable Long id) {
        Optional<ResponseRoleDTO> role = roleService.getRoleById(id);
        if (role.isPresent()) {
            return ResponseEntity.ok(role.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<Long> createRole(@RequestBody CreateRoleDTO role) {
        return ResponseEntity.ok(roleService.createRole(role));
    }
    @PutMapping("{id}")
    public ResponseEntity<CreateRoleDTO> updateRole(@PathVariable Long id, @RequestBody CreateRoleDTO role) {
        return ResponseEntity.ok(roleService.updateRole(id, role));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteRole(@PathVariable Long id) {
        return ResponseEntity.ok(roleService.deleteRole(id));
    }
}
