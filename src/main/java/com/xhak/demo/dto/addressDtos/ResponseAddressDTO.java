package com.xhak.demo.dto.addressDtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseAddressDTO {
    @NotNull(message = "ID must not be blank")
    private Long id;
    @NotBlank(message = "State must not be blank")
    private String state;
    @NotBlank(message = "City must not be blank")
    private String city;
    @NotBlank(message = "Street must not be blank")
    private String street;
    @NotNull(message = "Zip code must not be blank")
    private String zipCode;
    @NotNull(message = "UserID must not be blank")
    private Long userId;
    @NotBlank(message = "Username must not be blank")
    private String userFirstName;
}
