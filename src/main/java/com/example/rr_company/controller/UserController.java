package com.example.rr_company.controller;

import com.example.rr_company.excaption.ErrorDetails;
import com.example.rr_company.model.dto.request.LoginRequest;
import com.example.rr_company.model.dto.request.RegisterRequest;
import com.example.rr_company.model.dto.response.LoginResponse;
import com.example.rr_company.model.dto.response.RegisterResponse;
import com.example.rr_company.service.impl.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserService userService;
    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> regirster(@RequestBody RegisterRequest registerRequest) {
        RegisterResponse registerResponse = userService.register(registerRequest);
        return ResponseEntity.ok(registerResponse);
    }
//    @Operation(description = "for login and get token")
//    @ApiResponse(value = {
//            @ApiResponse(responseCode = "200", description = "successful"),
//            @ApiResponse(responseCode = "400", description = "bad request with detail",
//                    content = @Content(
//                            schema = @Schema(implementation = ErrorDetails.class),
//                            examples = {
//                                    @ExampleObject(name = "User not exist", value = "{\n  \"code\": \"1000\",\n  \"description\": \"user not exist in db\"\n}"),
//                                    @ExampleObject(name = "Wrong password", value = "{\n  \"code\": \"1005\",\n  \"description\": \"wrong password\"\n}"),
//                            }
//                    )),
//            @ApiResponse(responseCode = "500", description = "internal server error",
//                    content = @Content(
//                            schema = @Schema(implementation = ErrorDetails.class),
//                            examples = @ExampleObject(name = "Internal Server Error", value = "{\n  \"code\": \"5500\",\n  \"description\": \"exception message\"\n}")
//                    ))
//    }
//    )
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = userService.login(loginRequest);
        return ResponseEntity.ok(loginResponse);

    }


}
