package com.xhak.demo.controllers;

import com.xhak.demo.dto.userDtos.CreateUserDTO;
import com.xhak.demo.dto.userDtos.ResponseUserDTO;
import com.xhak.demo.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserService userService;

    @GetMapping("{id}")
    public ResponseEntity<ResponseUserDTO> getUserById(@PathVariable Long id) {
        Optional<ResponseUserDTO> user = userService.getUserById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<Long> createUser(@RequestBody CreateUserDTO user) {
        return ResponseEntity.ok(userService.createUser(user));
    }
    @PutMapping("{id}")
    public ResponseEntity<CreateUserDTO> updateUser(@PathVariable Long id, @RequestBody CreateUserDTO user) {
        return ResponseEntity.ok(userService.updateUser(id, user));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        return ResponseEntity.ok(userService.deleteUser(id));
    }
}
