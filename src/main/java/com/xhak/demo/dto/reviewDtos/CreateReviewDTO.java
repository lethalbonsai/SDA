package com.xhak.demo.dto.reviewDtos;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class CreateReviewDTO {
    @NotNull(message = "Product ID is required")
    @Min(value = 1, message = "Product ID should be at least 1")
    @Max(value = 5, message = "Product ID should be at most 5")
    @Schema(example = "1")
    private Long rating;
    @NotBlank(message = "Comment is required")
    @Size(min = 0, max = 500, message = "Comment must be between 0 and 500 characters")
    @Schema(example = "Comment")
    private String comment;
    @NotBlank(message = "Created time is required")
    @Schema(example = "2021-12-12T12:12:12")
    private LocalDateTime createdTime;
}
