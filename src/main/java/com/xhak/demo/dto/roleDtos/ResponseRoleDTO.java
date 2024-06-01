package com.xhak.demo.dto.roleDtos;

import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
public class ResponseRoleDTO {
    private Long id;
    private String roleName;
    private Set<Long> users;
}
