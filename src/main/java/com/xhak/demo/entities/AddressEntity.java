package com.xhak.demo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "ADDRESS")

public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "State is required")
    @Column(name = "STATE")
    private String state;
    @NotBlank(message = "City is required")
    @Column(name = "CITY")
    private String city;
    @NotBlank(message = "Street is required")
    @Column(name = "STREET")
    private String street;
    @NotBlank(message = "Zip code is required")
    @Column(name = "ZIP_CODE")
    private String zipCode;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientEntity client;
}
