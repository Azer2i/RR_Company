package com.example.rr_company.service;

import com.example.rr_company.mapper.MapperEmployee;
import com.example.rr_company.model.dto.request.EmployeeRequest;
import com.example.rr_company.model.dto.response.EmployeeResponse;
//import com.example.rr_company.model.request.EmployeeRequest;
//import com.example.rr_company.model.response.EmployeeResponse;
import com.example.rr_company.model.entity.Employee;
import com.example.rr_company.repository.EmployeeMyBatisRepo;
import com.example.rr_company.service.impl.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeMyBatisRepo employeeMyBatisRepo;
    private final MapperEmployee mapperEmployee;

    @Override
    public List<EmployeeResponse> allEmployee() {
        List<Employee> getAll = employeeMyBatisRepo.findAll();
        List<EmployeeResponse> employeeResponse = mapperEmployee.toEmployeeResponse(getAll);
        return employeeResponse;
    }

    @Override
    public EmployeeResponse findEmployeeById(Long id) {
        Optional<Employee> byEmployeeId = employeeMyBatisRepo.getByEmployeeId(id);
        return byEmployeeId.map(mapperEmployee::toEmployeeResponseById).orElse(null);
    }

    @Override
    public void insertEmployee(EmployeeRequest employeeRequest) {
        Employee employee = mapperEmployee.toEmployee(employeeRequest);
        employeeMyBatisRepo.insert(employee);
    }

    @Override
    public void UpdateEmployee(Long id, EmployeeRequest employeeRequest) {
        Employee updateEmployee = mapperEmployee.toUpdateEmployee(id, employeeRequest);
        employeeMyBatisRepo.update(updateEmployee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeMyBatisRepo.delete(id);
    }
}
