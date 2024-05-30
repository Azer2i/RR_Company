package com.example.rr_company.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeResponse {
    private Long id;
    private String name;
    private String surname;
    private String e_mail;
    private Long department_id;
    private Long position_id;
    public String status;
    public LocalDateTime created_at;
    public LocalDateTime updated_at;
}
