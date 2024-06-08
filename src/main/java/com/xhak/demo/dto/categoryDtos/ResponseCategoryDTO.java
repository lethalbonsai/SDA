package com.xhak.demo.dto.categoryDtos;

import com.xhak.demo.dto.productdtos.CreateProductDTO;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseCategoryDTO {
    private Long id;
    @NotBlank(message = "Name is required")
    private String name;

    private List<CreateProductDTO> productDTOList;
}
