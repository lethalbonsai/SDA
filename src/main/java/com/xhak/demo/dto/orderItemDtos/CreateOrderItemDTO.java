package com.xhak.demo.dto.orderItemDtos;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOrderItemDTO {
    @NotBlank(message = "Product name cannot be empty")
    @Size(min = 0, max = 999, message = "Product name must be between 0 and 900 characters")
    @Schema(example = "Product name")
    private Long quantity;
    @NotBlank(message = "Price cannot be empty")
    @Schema(example = "100")
    private double price;
    @NotBlank(message = "Total price cannot be empty")
    @Schema(example = "100")
    private double totalPrice;
}
