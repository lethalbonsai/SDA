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
@Table(name = "PRODUCTS")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PRICE")
    private double price;
    @Column(name = "QUANTITY")
    private Long quantity;
    @Column(name = "PRODUCT_TYPE")
    private String productType;
    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private CategoryEntity category;
}
