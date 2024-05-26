package com.xhak.demo.entities;

import com.xhak.demo.constant.Products;
import jakarta.persistence.*;

@Entity
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private double price;
    private int quantity;
    @Enumerated(EnumType.STRING)
    private Products productType;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;
}
