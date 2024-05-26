package com.xhak.demo.entities;

import com.xhak.demo.constant.Products;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRODUCTS")
@Getter
@Setter
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PRICE")
    private double price;
    @Column(name = "QUANTITY")
    private Long quantity;
    @Enumerated(EnumType.STRING)
    @Column(name = "PRODUCT_TYPE")
    private Products productType;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;
}
