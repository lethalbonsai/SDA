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
    private String State;
    @NotBlank(message = "City is required")
    @Column(name = "CITY")
    private String City;
    @NotBlank(message = "Street is required")
    @Column(name = "STREET")
    private String Street;
    @NotBlank(message = "Zip code is required")
    @Column(name = "ZIP_CODE")
    private String ZipCode;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
