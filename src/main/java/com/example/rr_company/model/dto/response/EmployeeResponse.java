package com.example.rr_company.model.dto.response;

import com.example.rr_company.model.entity.Department;
import com.example.rr_company.model.entity.Position;
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
    private String email;
    private DepartmentResponse department;
    private PositionResponse position;
    public String status;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;
}
