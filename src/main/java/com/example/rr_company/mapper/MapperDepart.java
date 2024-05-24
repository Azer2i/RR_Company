package com.example.rr_company.mapper;

import com.example.rr_company.model.dto.request.DepartmentRequest;
import com.example.rr_company.model.dto.response.DepartmentResponse;

import com.example.rr_company.model.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MapperDepart {

    MapperDepart INSTANCE = Mappers.getMapper(MapperDepart.class);

    List<DepartmentResponse> toDepartmentResponse(List<Department> departments);
    DepartmentResponse toDepartmentResponseId(Department department);
    Department toDepartment(DepartmentRequest departmentRequest);
    Department toDepartmentById(Long departmentId,DepartmentRequest departmentRequest);

}
