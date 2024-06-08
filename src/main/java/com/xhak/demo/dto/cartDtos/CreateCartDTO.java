package com.xhak.demo.dto.cartDtos;



import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCartDTO {
    @NotNull(message = "User ID is required")
    private Long userId;
}
