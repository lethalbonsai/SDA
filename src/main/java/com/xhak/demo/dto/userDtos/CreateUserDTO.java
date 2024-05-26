package com.xhak.demo.dto.userDtos;


import com.xhak.demo.constant.Subscription;
import com.xhak.demo.dto.addressDtos.CreateAddressDTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateUserDTO {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private Subscription subscription;
    private List<CreateAddressDTO> addresses;

}
