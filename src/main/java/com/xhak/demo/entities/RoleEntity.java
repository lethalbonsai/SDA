package com.xhak.demo.entities;


import com.xhak.demo.constant.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "ROLE")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE_NAME")
    private Role roleName;
    @ManyToMany(mappedBy = "roles")
    @Column(name = "users")
    private Set<UserEntity> users = new HashSet<>();
}
