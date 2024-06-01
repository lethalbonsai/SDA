package com.xhak.demo.dto.reviewDtos;


import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class CreateReviewDTO {
    private Long rating;
    private String comment;
    private LocalDateTime createdTime;
}
