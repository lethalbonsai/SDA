package com.xhak.demo.dto.reviewDtos;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class ResponseReviewDTO {
    private Long id;
    private Long rating;
    private String comment;
    private LocalDateTime createdTime;
    private Long userId;
    private Long productId;
}
