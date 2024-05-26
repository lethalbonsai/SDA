package com.xhak.demo.entities;

import jakarta.persistence.*;

@Entity
public class OrderItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "order_id")
    private ProductEntity product;
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private CartEntity cart;
    private Long quantity;
    private Long totalPrice;
}
