package com.xhak.demo.dto.productdtos;

import com.xhak.demo.dto.reviewDtos.CreateReviewDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseProductDTO {
    @NotNull(message = "Product ID is mandatory")
    private Long id;
    @NotBlank(message = "Title is required")
    private String title;
    @NotBlank(message = "Description is required")
    private String description;
    @NotNull(message = "Price is required")
    private double price;
    @NotNull(message = "Quantity is required")
    private Long quantity;
    @NotBlank(message = "Product type is required")
    private String productType;
    @NotNull(message = "Category ID is required")
    private Long categoryId;
    @NotBlank(message = "Category name is required")
    private List<CreateReviewDTO> createReviewDTOList;
}
