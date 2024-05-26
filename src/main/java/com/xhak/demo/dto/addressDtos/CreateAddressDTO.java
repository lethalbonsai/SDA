package com.xhak.demo.dto.addressDtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAddressDTO {
    @NotBlank(message = "State is required")
    private String state;
    @NotBlank(message = "City is required")
    private String city;
    @NotBlank(message = "Street is required")
    private String street;
    @NotBlank(message = "Zip code is required")
    private String zipCode;
}
