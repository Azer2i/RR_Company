package com.example.rr_company.model.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginResponse {
    private String token;
    private String response;

    public static LoginResponse withResponse(String response) {
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setResponse(response);
        return loginResponse;
    }

    public static LoginResponse withToken(String token) {
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setToken(token);
        return loginResponse;
    }

}
