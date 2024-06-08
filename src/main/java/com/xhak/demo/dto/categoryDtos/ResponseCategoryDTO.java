package com.xhak.demo.dto.categoryDtos;

import com.xhak.demo.dto.productdtos.CreateProductDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseCategoryDTO {
    @NotNull(message = "Category ID is required")
    private Long id;
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Product list cant be empty")
    private List<CreateProductDTO> productDTOList;
}
