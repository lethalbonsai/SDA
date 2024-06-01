package com.xhak.demo.dto.productdtos;

import com.xhak.demo.entities.ProductEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductDTO {
    private String title;
    private String description;
    private double price;
    private Long quantity;
    private ProductEntity productType;
}
