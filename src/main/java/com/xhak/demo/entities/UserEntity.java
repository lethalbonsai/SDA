package com.xhak.demo.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

@Table
@Entity
public class UserEntity {
    @Id
    private Long id;


    private String username;

    @Column(nullable = false)
    private String password;


    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String subscribtion;

    @Column(nullable = false)
    private String role;
}
