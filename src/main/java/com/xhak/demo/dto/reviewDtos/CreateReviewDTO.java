package com.xhak.demo.dto.reviewDtos;

import com.xhak.demo.dto.userDtos.CreateUserDTO;
import com.xhak.demo.dto.productdtos.CreateProductDTO;
import com.xhak.demo.dto.productdtos.ResponseProductDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CreateReviewDTO {
    private CreateUserDTO user;
    private CreateProductDTO createProductDTO;
    private ResponseProductDTO responseProductDTO;
    private Long rating;
    private String comment;
    private LocalDateTime createdTime;
}
