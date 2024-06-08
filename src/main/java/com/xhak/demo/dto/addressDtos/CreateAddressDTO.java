package com.xhak.demo.dto.addressDtos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAddressDTO {
    @NotBlank(message = "State is required")
    @Schema(example = "UNITED KINGDOM")
    private String state;
    @NotBlank(message = "City is required")
    @Schema(example = "LONDON")
    private String city;
    @NotBlank(message = "Street is required")
    @Schema(example = "Baker Street")
    private String street;
    @NotNull(message = "Zip code is required")
    @Schema(example = "12345")
    private String zipCode;
    private Long userId;
}
