package com.xhak.demo.dto.roleDtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateRoleDTO {
    @NotBlank(message = "Role name is required")
    private String roleName;

}
