package com.xhak.demo.dto;

import com.xhak.demo.dto.productdtos.CreateProductDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CategoryDTO {
    private Long id;
    private String name;
    private List<CreateProductDTO> products;
}
