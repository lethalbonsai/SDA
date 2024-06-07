package com.xhak.demo.dto.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogInDTO {
    private String username;
    private String email;
    private String password;
}
