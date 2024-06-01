package com.xhak.demo.dto.orderItemDtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrderItemDTO {
    private Long quantity;
    private double price;
    private double totalPrice;
}
