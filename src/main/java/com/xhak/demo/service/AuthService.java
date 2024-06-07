package com.xhak.demo.service;

import com.xhak.demo.dto.payload.LogInDTO;
import com.xhak.demo.dto.payload.RegisterEmployeeDTO;

public interface AuthService {
    String accountLogin(LogInDTO logInDTO);
    String registerAccount(RegisterEmployeeDTO registerEmployeeDTO);
}
