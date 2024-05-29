package com.example.rr_company.model.dto.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeWithDepartmentAndPosition {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String status;
    private Date createdAt;
    private Date updatedAt;
    private Long departmentId;
    private String departmentName;
    private Date departmentCreatedAt;
    private Date departmentUpdatedAt;
    private Long positionId;
    private String positionName;
    private Integer positionSalary;
    private Date positionCreatedAt;
    private Date positionUpdatedAt;
}
