package com.xhak.demo.dto;

import com.xhak.demo.dto.productdtos.CreateProductDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemDTO {
    private Long id;
    private CreateProductDTO product;
    private CartDTO cart;
    private int quantity;
    private double price;
    private double totalPrice;
}
