package com.example.rr_company.controller;

import com.example.rr_company.model.dto.request.LoginRequest;
import com.example.rr_company.model.dto.request.RegisterRequest;
import com.example.rr_company.model.dto.response.LoginResponse;
import com.example.rr_company.model.dto.response.RegisterResponse;
import com.example.rr_company.service.impl.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    UserService userService;
    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> regirster(@RequestBody RegisterRequest registerRequest) {
        RegisterResponse registerResponse = userService.register(registerRequest);
        return ResponseEntity.ok(registerResponse);
    }
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = userService.login(loginRequest);
        return ResponseEntity.ok(loginResponse);

    }

}
