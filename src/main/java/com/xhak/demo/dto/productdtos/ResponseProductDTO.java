package com.xhak.demo.dto.productdtos;

import com.xhak.demo.dto.ReviewDtos.ReviewDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseProductDTO {
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String productType;
    private Long categoryId;

    private List<ReviewDTO> reviewDTOList;
}
