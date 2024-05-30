package com.example.rr_company.mapper;

import com.example.rr_company.model.dto.request.DepartmentRequest;
import com.example.rr_company.model.dto.response.DepartmentResponse;

import com.example.rr_company.model.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;
import java.util.List;


@Mapper(componentModel = "spring",imports = {LocalDateTime.class})
public interface MapperDepart {

    MapperDepart INSTANCE = Mappers.getMapper(MapperDepart.class);

    List<DepartmentResponse> toDepartmentResponse(List<Department> departments);
    DepartmentResponse toDepartmentResponseId(Department department);
    @Mapping(target = "created_at",expression = "java(LocalDateTime.now())")
    Department toDepartment(DepartmentRequest departmentRequest);
    @Mapping(target = "updated_at",expression = "java(LocalDateTime.now())")



    Department toDepartmentById(Long departmentId,DepartmentRequest departmentRequest);

}
