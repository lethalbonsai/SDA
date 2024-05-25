package com.xhak.demo.entities;

import com.xhak.demo.constant.Role;
import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.HashSet;
import java.util.Set;

@Entity
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Role roleName;
    @ManyToMany(mappedBy = "roles")
    private Set<UserEntity> users = new HashSet<>();
}
