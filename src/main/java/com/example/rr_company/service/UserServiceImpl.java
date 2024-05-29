package com.example.rr_company.service;

import com.example.rr_company.excaption.CommonExcaption;
import com.example.rr_company.mapper.UserMapper;
import com.example.rr_company.model.dto.request.LoginRequest;
import com.example.rr_company.model.dto.request.RegisterRequest;
import com.example.rr_company.model.dto.response.LoginResponse;
import com.example.rr_company.model.dto.response.RegisterResponse;
import com.example.rr_company.model.entity.User;
import com.example.rr_company.repository.UserMyBatisRepo;
import com.example.rr_company.service.impl.UserService;
import com.example.rr_company.util.Jwtprovider;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.rr_company.util.Jwtprovider;

import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMyBatisRepo userMyBatisRepo;
    private final AuthenticationManager authenticationManager;
    private final Jwtprovider jwtprovider;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;


    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        Optional<User> userOptional = getByUsername(loginRequest.getUsername());
        if (userOptional.isEmpty()) {
            throw new CommonExcaption("1000","user not exist in db", HttpStatus.BAD_REQUEST);
        }
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword());
        authenticationManager.authenticate(authenticationToken);
        String token = jwtprovider.generateToken(userOptional.get());
        return LoginResponse.withToken(token);

    }

    @Override
    public RegisterResponse register(RegisterRequest registerRequest) {
        if (!Objects.equals(registerRequest.getPassword(), registerRequest.getConfirmPassword())) {
            throw new CommonExcaption("1001", "password and confirmPassword not matched", HttpStatus.BAD_REQUEST);
//
        }
        Optional<User> byUsernameOptional = userMyBatisRepo.findByUsername(registerRequest.getUsername());
        if (byUsernameOptional.isPresent()) {
            return new RegisterResponse("duplicate_username");
        }
        User user = userMapper.toUser(registerRequest);
        user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        userMyBatisRepo.insert(user);
        return new RegisterResponse("Success");
    }

    @Override
    public Optional<User> getByUsername(String username) {
        return userMyBatisRepo.findByUsername(username);
    }

}
