package com.xhak.demo.dto.orderDtos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class CreateOrderDTO {
    @NotNull(message = "Price cannot be empty")
    @Schema(example = "100")
    private Long price;
    @NotBlank(message = "Status cannot be empty")
    @Schema(example = "PENDING")
    private String status;
    @NotBlank(message = "Order date cannot be empty")
    @Schema(example = "2021-12-12T12:12:12")
    private LocalDateTime orderDate;
    @NotBlank(message = "Delivery date cannot be empty")
    @Schema(example = "2021-12-12T12:12:12")
    private LocalDateTime deliveryDate;
    @NotNull(message = "User ID cannot be empty")
    private Long userId;
}
