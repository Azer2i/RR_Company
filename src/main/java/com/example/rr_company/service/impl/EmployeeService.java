package com.example.rr_company.service.impl;

import com.example.rr_company.model.dto.request.EmployeeRequest;
import com.example.rr_company.model.dto.response.EmployeeResponse;
import com.example.rr_company.model.dto.util.EmployeeWithDepartmentAndPosition;
//import com.example.rr_company.model.request.EmployeeRequest;
//import com.example.rr_company.model.response.EmployeeResponse;

import java.util.List;

public interface EmployeeService {
    List<EmployeeResponse> allEmployee();
    EmployeeResponse findEmployeeById(Long id);

    void insertEmployee(EmployeeRequest employeeRequest);
    void UpdateEmployee(Long id,EmployeeRequest employeeRequest);
    void deleteEmployee(Long id);

    List<EmployeeWithDepartmentAndPosition> getEmployeesWithDepartmentAndPosition();
}
