package com.xhak.demo.dto.categoryDtos;

import com.xhak.demo.dto.productdtos.CreateProductDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateCategoryDTO {
    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name cannot be longer than 100 characters")
    private String name;
    private List<CreateProductDTO> products;
}
