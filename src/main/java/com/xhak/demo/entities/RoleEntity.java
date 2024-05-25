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
public class RoleEntity {
    @Id
    private Long id;


    @Column(nullable = false)
    private String user;

    @Column(nullable = false)
    private String admin;
}
