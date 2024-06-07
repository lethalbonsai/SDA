package com.xhak.demo.service;

import com.xhak.demo.dto.payload.LogInDTO;

public interface AuthService {
    String accountLogin(LogInDTO logInDTO);
}
