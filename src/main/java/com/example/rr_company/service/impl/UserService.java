package com.example.rr_company.service.impl;

import com.example.rr_company.model.dto.request.LoginRequest;
import com.example.rr_company.model.dto.request.RegisterRequest;
import com.example.rr_company.model.dto.response.LoginResponse;
import com.example.rr_company.model.dto.response.RegisterResponse;
import com.example.rr_company.model.entity.User;

import java.util.Optional;

public interface UserService {
LoginResponse login(LoginRequest loginRequest);
    RegisterResponse register(RegisterRequest registerRequest);
    Optional<User> getByUsername(String username);

}
