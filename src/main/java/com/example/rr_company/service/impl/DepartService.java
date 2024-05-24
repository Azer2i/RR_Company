package com.example.rr_company.service.impl;

import com.example.rr_company.model.dto.request.DepartmentRequest;
import com.example.rr_company.model.dto.response.DepartmentResponse;

import java.util.List;

public interface DepartService {
    List<DepartmentResponse> getAllDepartments();
    DepartmentResponse getDepartmentById(Long id);
    void addDepartment(DepartmentRequest departmentRequest);
    void updateDepartment(Long id, DepartmentRequest departmentRequest);
    void deleteDepartment(Long id);

}
