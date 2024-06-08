package com.xhak.demo.dto.roleDtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
public class ResponseRoleDTO {
    @NotNull(message = "Role ID is mandatory")
    private Long id;
    @NotBlank(message = "Role name is required")
    private String roleName;
    private Set<Long> users;
}
