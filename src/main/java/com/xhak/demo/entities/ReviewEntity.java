package com.xhak.demo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userrname;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;

    private Long rating;
    private String comment;
    @CreationTimestamp
    private LocalDateTime createdTime;
}
