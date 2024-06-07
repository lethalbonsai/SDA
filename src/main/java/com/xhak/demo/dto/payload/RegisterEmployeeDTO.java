package com.xhak.demo.dto.payload;

import com.xhak.demo.entities.AddressEntity;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class RegisterEmployeeDTO {
    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private List<AddressEntity> addressList;
}
