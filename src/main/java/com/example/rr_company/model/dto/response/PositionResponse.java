package com.example.rr_company.model.dto.response;

import com.example.rr_company.model.entity.Department;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PositionResponse {
    private int id;
    private String name;
    private Integer salary;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private DepartmentResponse department;
}
