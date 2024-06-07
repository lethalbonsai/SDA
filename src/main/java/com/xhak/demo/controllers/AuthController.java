package com.xhak.demo.controllers;

import com.xhak.demo.dto.payload.LogInDTO;
import com.xhak.demo.service.impl.AuthServiceFromDB;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private AuthServiceFromDB authServiceFromDB;

    @PostMapping("/login")
    public ResponseEntity<String> login(LogInDTO logInDTO) {
        return ResponseEntity.ok(authServiceFromDB.accountLogin(logInDTO));
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody ) {
        return ResponseEntity.ok("User registered!");
    }
}
