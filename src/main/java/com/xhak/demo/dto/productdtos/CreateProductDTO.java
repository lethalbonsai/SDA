package com.xhak.demo.dto.productdtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductDTO {
    private String title;
    private String description;
    private double price;
    private Long quantity;
    private String productType;
}
