package com.xhak.demo.dto.reviewDtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class ResponseReviewDTO {
    @NotNull(message = "Review ID is mandatory")
    private Long id;
    @NotNull(message = "Rating is required")
    private Long rating;
    @NotBlank(message = "Comment is required")
    private String comment;
    @NotBlank(message = "Created time is required")
    private LocalDateTime createdTime;
    @NotNull(message = "User ID is required")
    private Long userId;
    @NotNull(message = "Product ID is required")
    private Long productId;
}
