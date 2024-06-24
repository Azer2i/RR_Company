package com.example.rr_company.model.entity;

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
public class Employee {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private Long departmentId;
    private Long positionId;
    public String status;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;
}
