package com.xhak.demo.dto.userDtos;

import com.xhak.demo.dto.addressDtos.CreateAddressDTO;
import com.xhak.demo.dto.roleDtos.ResponseRoleDTO;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class ResponseUserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String subscription;
    private List<CreateAddressDTO> addresses;
    private Set<ResponseRoleDTO> roles;
}
