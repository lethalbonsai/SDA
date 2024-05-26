package com.xhak.demo.dto;

import com.xhak.demo.constant.Subscription;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private Subscription subscription;
    private List<AddressDTO> addresses;
}
