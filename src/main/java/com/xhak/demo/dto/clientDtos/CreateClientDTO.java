package com.xhak.demo.dto.clientDtos;

import com.xhak.demo.dto.addressDtos.CreateAddressDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateClientDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private List<CreateAddressDTO> addresses;
}
