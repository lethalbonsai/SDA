package com.xhak.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "ORDER_ITEM")
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
    @Column(name = "QUANTITY")
    private Long quantity;
    @Column(name = "TOTAL_PRICE")
    private Long totalPrice;
}
