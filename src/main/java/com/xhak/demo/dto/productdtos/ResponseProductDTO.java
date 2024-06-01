package com.xhak.demo.dto.productdtos;

import com.xhak.demo.dto.reviewDtos.CreateReviewDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponseProductDTO {
    private Long id;
    private String title;
    private String description;
    private double price;
    private Long quantity;
    private String productType;
    private Long categoryId;
    private List<CreateReviewDTO> createReviewDTOList;
}
