package com.xhak.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "ORDERS")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private UserEntity username;
    @Column(name = "PRICE")
    private  Long price;
    @Column(name = "STATUS")
    private  String status;
    @Column(name = "ORDER_DATE")
    private LocalDateTime orderDate;
    @Column(name = "DELIVERY_DATE")
    private LocalDateTime deliveryDate;
}
