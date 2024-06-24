package com.example.rr_company.repository;

import com.example.rr_company.model.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface DepartmentMyBatisRepo {
   List<Department> findAll();
   Optional<Department> findById(@Param("id")Long id);
   void insert(Department department);
   void update(Department department);
   void delete(@Param("id")Long id);



}
