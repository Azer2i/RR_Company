package com.example.rr_company.mapper;

import com.example.rr_company.model.dto.response.EmployeeResponse;

import com.example.rr_company.model.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.example.rr_company.model.dto.request.EmployeeRequest;

import java.util.List;

@Mapper
public interface MapperEmployee {
    MapperEmployee INSTANCE = Mappers.getMapper(MapperEmployee.class);

    List<EmployeeResponse> toEmployeeResponse(List<Employee> employees);
    EmployeeResponse toEmployeeResponseById(Employee employee);

    Employee toEmployee(EmployeeRequest employeeRequest);

    Employee toUpdateEmployee(Long id, EmployeeRequest employeeRequest);

}
