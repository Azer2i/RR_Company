package com.example.rr_company.repository;

import com.example.rr_company.model.entity.Employee;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface EmployeeMyBatisRepo {
    List<Employee> findAll();

    Optional<Employee> getByEmployeeId(@Param("id")Long id);

    void insert(Employee employee);
    void update(Employee employee);
    void delete(@Param("id")Long id);
}
