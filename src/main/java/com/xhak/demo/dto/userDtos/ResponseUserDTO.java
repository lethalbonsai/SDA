package com.xhak.demo.dto.userDtos;

import com.xhak.demo.dto.addressDtos.CreateAddressDTO;
import com.xhak.demo.dto.roleDtos.ResponseRoleDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class ResponseUserDTO {
    @NotNull(message = "User ID is mandatory")
    private Long id;
    @NotBlank(message = "First name is required")
    private String firstName;
    @NotBlank(message = "Last name is required")
    private String lastName;
    @NotBlank(message = "Username is required")
    private String username;
    @NotBlank(message = "Email is required")
    private String email;
    @NotBlank(message = "Password is required")
    private String password;
    @NotBlank(message = "Subscription is required")
    private String subscription;
    @NotBlank(message = "Address is required")
    private List<CreateAddressDTO> addresses;
    @NotBlank(message = "Roles are required")
    private Set<ResponseRoleDTO> roles;
}
