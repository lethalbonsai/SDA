package com.xhak.demo.entities;

import jakarta.persistence.*;

@Entity
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String State;
    private String City;
    private String Street;
    private String ZipCode;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

}
