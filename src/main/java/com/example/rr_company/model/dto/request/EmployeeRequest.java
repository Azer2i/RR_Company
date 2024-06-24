package com.example.rr_company.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EmployeeRequest {
    private String name;
    private String surname;
    private String email;
    private Long departmentId;
    private Long positionId;
    public String status;
    public Date createdAt;
    public Date updatedAt;
}
