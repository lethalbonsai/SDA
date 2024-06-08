package com.xhak.demo.dto.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogInDTO {
    @NotBlank(message = "Username is required")
    @Schema(example = "JonnyDoe")
    private String username;
    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    @Schema(example = "example@gmail.com")
    private String email;
    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password should be at least 6 characters")
    @Schema(example = "abc1234")
    private String password;
}
