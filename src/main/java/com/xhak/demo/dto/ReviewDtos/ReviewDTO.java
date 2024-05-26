package com.xhak.demo.dto.ReviewDtos;

import com.xhak.demo.dto.UserDTO;
import com.xhak.demo.dto.productdtos.CreateProductDTO;
import com.xhak.demo.dto.productdtos.ResponseProductDTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ReviewDTO {
    private Long id;
    private UserDTO user;
    private CreateProductDTO createProductDTO;
    private ResponseProductDTO responseProductDTO;
    private Long rating;
    private String comment;
    private LocalDateTime createdTime;
}
