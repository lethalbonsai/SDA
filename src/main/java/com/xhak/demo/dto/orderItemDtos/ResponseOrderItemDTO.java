package com.xhak.demo.dto.orderItemDtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseOrderItemDTO {
    @NotNull(message = "Order item ID is mandatory")
    private Long id;
    @NotNull(message = "Quantity is required")
    private Long quantity;
    @NotNull(message = "Total Price is required")
    private double totalPrice;
    @NotNull(message = "Product ID is required")
    private Long productId;
    @NotNull(message = "Cart ID is required")
    private Long cartId;
    @NotNull(message = "Order ID is required")
    private Long orderId;
}
