package com.xhak.demo.dto.userDtos;


import com.xhak.demo.dto.addressDtos.CreateAddressDTO;
import com.xhak.demo.dto.roleDtos.CreateRoleDTO;
import com.xhak.demo.dto.roleDtos.ResponseRoleDTO;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class CreateUserDTO {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String subscription;
    private String password;
    private List<CreateAddressDTO> addresses;
    @Valid
    private Set<CreateRoleDTO> roles;

}
