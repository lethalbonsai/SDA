package com.xhak.demo.dto.addressDtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseAddressDTO {
    private Long id;
    @NotBlank(message = "State must not be blank")
    private String state;
    @NotBlank(message = "City must not be blank")
    private String city;
    @NotBlank(message = "Street must not be blank")
    private String street;
    @NotBlank(message = "Zip code must not be blank")
    private String zipCode;
    @NotBlank(message = "Country must not be blank")
    private Long userId;
    @NotBlank(message = "Country must not be blank")
    private String userFirstName;
}
