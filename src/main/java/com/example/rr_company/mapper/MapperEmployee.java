package com.example.rr_company.mapper;

import com.example.rr_company.model.dto.response.EmployeeResponse;

import com.example.rr_company.model.entity.EmpWrapper;
import com.example.rr_company.model.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.example.rr_company.model.dto.request.EmployeeRequest;

import java.time.LocalDateTime;
import java.util.List;

@Mapper(componentModel = "spring",imports = {LocalDateTime.class})
public interface MapperEmployee {
//    MapperEmployee INSTANCE = Mappers.getMapper(MapperEmployee.class);

    @Mapping(target = "id",source = "empId")
    @Mapping(target = "name",source = "empName")
    @Mapping(target = "surname",source = "empSurname")
    @Mapping(target = "email",source = "empEmail")
    @Mapping(target = "createdAt",source = "empCreatedAt")
    @Mapping(target = "updatedAt",source = "empUpdatedAt")
    @Mapping(target = "status",source = "empStatus")
    @Mapping(target = "position.id",source = "PId")
    @Mapping(target = "position.name",source = "PName")
    @Mapping(target = "position.salary",source = "PSalary")
    @Mapping(target = "position.createdAt",source = "PCreatedAt")
    @Mapping(target = "position.updatedAt",source = "PUpdatedAt")
    @Mapping(target = "department.id",source = "DId")
    @Mapping(target = "department.name",source = "DName")
    @Mapping(target = "department.createdAt",source = "DCreatedAt")
    @Mapping(target = "department.updatedAt",source = "DUpdatedAt")
    EmployeeResponse toEmployeeResponse(EmpWrapper empWrapper);

    List<EmployeeResponse> toEmployeeResponses(List<EmpWrapper> empWrappers);

    @Mapping(target = "createdAt",expression = "java(LocalDateTime.now())")
    Employee toEmployee(EmployeeRequest employeeRequest);
    @Mapping(target = "updatedAt",expression = "java(LocalDateTime.now())")
    Employee toUpdateEmployee(Long id, EmployeeRequest employeeRequest);

}
