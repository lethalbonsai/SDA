package com.xhak.demo.dto.clientDtos;

import com.xhak.demo.dto.addressDtos.CreateAddressDTO;
import com.xhak.demo.dto.roleDtos.ResponseRoleDTO;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
public class CreateClientDTO {

    @NotNull(message = "First name is required")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    @Schema(example = "John")
    private String firstName;
    @NotNull(message = "Last name is required")
    @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
    @Schema(example = "Doe")
    private String lastName;
    @NotNull(message = "Email is required")
    @Email(message = "Email should be valid")
    @Schema(example = "user@gmail.com")
    private String email;
    @NotNull(message = "Phone number is required")
    @Schema(example = "+355682007568")
    private String phoneNumber;
    @NotNull(message = "Addresses are required")
    @ArraySchema(
            arraySchema = @Schema(
                    description = "List of addresses",
                    example = "[{\"state\":\"UNITED KINGDOM\",\"city\":\"LONDON\",\"street\":\"Baker Street\",\"zipCode\":\"12345\",\"userId\":1}]"
            ),
            schema = @Schema(
                    description = "Address",
                    implementation = CreateAddressDTO.class
            )
    )
    private List<CreateAddressDTO> addresses;
    @NotBlank(message = "Roles are required")
    @ArraySchema(
            arraySchema = @Schema(
                    description = "List of roles",
                    example = "[{\"id\":1,\"role\":\"ADMIN\"}]"
            ),
            schema = @Schema(
                    description = "Role",
                    implementation = ResponseRoleDTO.class
            )
    )
    private Set<ResponseRoleDTO> roles;
}
