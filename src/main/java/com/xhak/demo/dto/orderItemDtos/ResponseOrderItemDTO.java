package com.xhak.demo.dto.orderItemDtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseOrderItemDTO {
    private Long id;
    private Long quantity;
    private double totalPrice;
    private Long productId;
    private Long cartId;
    private Long orderId;
}
