package com.xhak.demo.dto;


import com.xhak.demo.constant.Subscription;
import com.xhak.demo.entities.AddressEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDTO {


    private Long id;
    private String username;
    private String password;
    private String email;
    private String name;
    private String lastName;
    private Subscription subscription;
    private List<AddressEntity> addresses;

}
