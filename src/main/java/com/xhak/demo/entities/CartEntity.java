package com.xhak.demo.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity username;

    @OneToMany(mappedBy = "cart")
    private List<OrderItemEntity> orderItems;

}