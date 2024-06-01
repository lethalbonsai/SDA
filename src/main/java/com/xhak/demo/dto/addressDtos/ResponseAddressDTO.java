package com.xhak.demo.dto.addressDtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseAddressDTO {
    private Long id;
    private String state;
    private String city;
    private String street;
    private String zipCode;
    private Long userId;
    private String userFirstName;
}
