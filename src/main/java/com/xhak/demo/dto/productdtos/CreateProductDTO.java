package com.xhak.demo.dto.productdtos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductDTO {
    @NotBlank(message = "Title is required")
    @Schema(example = "Product title")
    private String title;
    @NotBlank(message = "Description is required")
    @Schema(example = "Product description")
    private String description;
    @NotNull(message = "Price is required")
    @Schema(example = "100")
    private double price;
    @NotNull(message = "Quantity is required")
    @Schema(example = "100")
    private Long quantity;
    @NotBlank(message = "Product type is required")
    @Schema(example = "Product type")
    private String productType;
}
