package com.example.rr_company.excaption;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatusCode;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommonExcaption extends RuntimeException {
    private String code;
    private String description;
    private HttpStatusCode httpStatusCode;
}
