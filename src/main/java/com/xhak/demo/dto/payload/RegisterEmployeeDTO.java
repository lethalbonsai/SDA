package com.xhak.demo.dto.payload;

import com.xhak.demo.entities.AddressEntity;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class RegisterEmployeeDTO {
    @NotBlank(message = "Username is required")
    @Schema(example = "JonnyDoe")
    private String username;
    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    @Schema(example = "example@gmail.com")
    private String email;
    @NotBlank(message = "Password is required")
    @Schema(example = "abc1234")
    private String password;
    @NotBlank(message = "First name is required")
    @Schema(example = "Jonny")
    private String firstName;
    @NotBlank(message = "Last name is required")
    @Schema(example = "Doe")
    private String lastName;
    @NotNull(message = "Phone number is required")
    @Schema(example = "+355682007568")
    private String phoneNumber;
    @NotBlank(message = "Address is required")
    @ArraySchema(
            arraySchema = @Schema(
                    description = "List of addresses",
                    example = "[{\"state\":\"UNITED KINGDOM\",\"city\":\"LONDON\",\"street\":\"Baker Street\",\"zipCode\":\"12345\",\"userId\":1}]"
            ),
            schema = @Schema(
                    description = "Address",
                    implementation = AddressEntity.class
            )
    )
    private List<AddressEntity> addressList;
}
