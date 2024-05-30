package com.example.rr_company.mapper;

import com.example.rr_company.model.dto.response.EmployeeResponse;

import com.example.rr_company.model.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.example.rr_company.model.dto.request.EmployeeRequest;

import java.time.LocalDateTime;
import java.util.List;

@Mapper(componentModel = "spring",imports = {LocalDateTime.class})
public interface MapperEmployee {
    MapperEmployee INSTANCE = Mappers.getMapper(MapperEmployee.class);

    List<EmployeeResponse> toEmployeeResponse(List<Employee> employees);
    @Mapping(target = "created_at",expression = "java(LocalDateTime.now())")
    EmployeeResponse toEmployeeResponseById(Employee employee);
    @Mapping(target = "updated_at",expression = "java(LocalDateTime.now())")

    Employee toEmployee(EmployeeRequest employeeRequest);

    Employee toUpdateEmployee(Long id, EmployeeRequest employeeRequest);

}
