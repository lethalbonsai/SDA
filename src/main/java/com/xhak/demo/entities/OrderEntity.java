package com.xhak.demo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
    private UserEntity userId;
    @NotBlank(message = "Price cannot be blank")
    @Column(name = "PRICE")
    private  Long price;
    @NotBlank(message = "Status cannot be blank")
    @Column(name = "STATUS")
    private  String status;
    @NotBlank(message = "Order date cannot be blank")
    @Column(name = "ORDER_DATE")
    private LocalDateTime orderDate;
    @NotBlank(message = "Delivery date cannot be blank")
    @Column(name = "DELIVERY_DATE")
    private LocalDateTime deliveryDate;
}
