package com.xhak.demo.dto.orderItemDtos;

import com.xhak.demo.dto.cartDtos.CreateCartDTO;
import com.xhak.demo.dto.productdtos.CreateProductDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrderItemDTO {
    private CreateProductDTO product;
    private CreateCartDTO cart;
    private int quantity;
    private double price;
    private double totalPrice;
}
