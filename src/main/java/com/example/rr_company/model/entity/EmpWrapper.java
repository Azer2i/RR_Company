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
public class EmpWrapper {
    //EmployeeFields
    private int empId;
    private String empName;
    private String empSurname;
    private String empEmail;
    private String empStatus;
    private Date empCreatedAt;
    private Date empUpdatedAt;
    //positionFields
    private int pId;
    private String pName;
    private int pSalary ;
    private LocalDateTime pCreatedAt;
    private LocalDateTime pUpdatedAt;
    //departmentFields
    private Long dId;
    private String dName;
    private LocalDateTime dCreatedAt;
    private LocalDateTime dUpdatedAt;


}
