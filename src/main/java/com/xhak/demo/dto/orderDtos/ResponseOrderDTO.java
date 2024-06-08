package com.xhak.demo.dto.orderDtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class ResponseOrderDTO {
    private Long id;
    @NotBlank(message = "Price cannot be empty")
    private Long price;
    @NotBlank(message = "Status cannot be empty")
    private String status;
    @NotBlank(message = "Order date cannot be empty")
    private LocalDateTime orderDate;
    @NotBlank(message = "Delivery date cannot be empty")
    private LocalDateTime deliveryDate;
    @NotBlank(message = "User ID cannot be empty")
    private Long userId;

}
