package com.xhak.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {

    private Long id;
    private String state;
    private String city;
    private String street;
    private String zipCode;
}
