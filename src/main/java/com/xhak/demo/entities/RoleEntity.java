package com.xhak.demo.entities;



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
    @Column(name = "ID")
    private Long id;
    @Column(name = "ROLE_NAME")
    private String roleName;
//    @ManyToMany(mappedBy = "roles")
//    @Column(name = "USERS")
//    private Set<UserEntity> users = new HashSet<>();
}

