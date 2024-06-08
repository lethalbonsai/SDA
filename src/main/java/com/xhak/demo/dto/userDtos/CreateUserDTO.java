package com.xhak.demo.dto.userDtos;


import com.xhak.demo.dto.addressDtos.CreateAddressDTO;
import com.xhak.demo.dto.roleDtos.CreateRoleDTO;
import com.xhak.demo.dto.roleDtos.ResponseRoleDTO;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Set;

@Getter
@Setter
public class CreateUserDTO {
    @NotBlank(message = "First name is required")
    @Schema(example = "John")
    private String firstName;
    @NotBlank(message = "Last name is required")
    @Schema(example = "Doe")
    private String lastName;
    @NotBlank(message = "Username is required")
    @Schema(example = "JonnyDoe")
    private String username;
    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    @Schema(example = "example@gmail.com")
    private String email;
    @NotBlank(message = "Subscription is required")
    @Schema(example = "Free")
    private String subscription;
    @NotBlank(message = "Password is required")
    @Schema(example = "abc1234")
    private String password;
    @NotBlank(message = "Address is required")
    @ArraySchema(arraySchema =
    @Schema(
            description = "List of addresses",
            example = "[{\"state\":\"UNITED KINGDOM\",\"city\":\"LONDON\",\"street\":\"Baker Street\",\"zipCode\":\"12345\",\"userId\":1}]"
    ),
            schema = @Schema(
                    description = "Address",
                    implementation = CreateAddressDTO.class
            )
    )
    private List<CreateAddressDTO> addresses;
    @Valid
    private Set<CreateRoleDTO> roles;

}
