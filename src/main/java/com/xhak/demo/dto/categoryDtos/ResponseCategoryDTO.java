package com.xhak.demo.dto.categoryDtos;

import com.xhak.demo.dto.productdtos.CreateProductDTO;

import java.util.List;

public class ResponseCategoryDTO {
    private Long id;
    private String name;
    private List<CreateProductDTO> productDTOList;
}
