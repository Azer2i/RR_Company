package com.example.rr_company.service;

import com.example.rr_company.mapper.MapperEmployee;
import com.example.rr_company.model.dto.request.EmployeeRequest;
import com.example.rr_company.model.dto.response.EmployeeResponse;
//import com.example.rr_company.model.request.EmployeeRequest;
//import com.example.rr_company.model.response.EmployeeResponse;
//import com.example.rr_company.model.dto.util.EmployeeWithDepartmentAndPosition;
import com.example.rr_company.model.entity.EmpWrapper;
import com.example.rr_company.model.entity.Employee;
import com.example.rr_company.repository.EmployeeMyBatisRepo;
import com.example.rr_company.service.impl.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeMyBatisRepo employeeMyBatisRepo;
    private final MapperEmployee mapperEmployee;

    @Override
    public List<EmployeeResponse> allEmployee() {
        List<EmpWrapper> wrapperList = employeeMyBatisRepo.findAll();
        List<EmployeeResponse> employeeResponse = mapperEmployee.toEmployeeResponses(wrapperList);
        return employeeResponse;
    }

    @Override
    public EmployeeResponse findEmployeeById(Long id) {
        EmpWrapper empWrapper = employeeMyBatisRepo.getByEmployeeId(id);
        return mapperEmployee.toEmployeeResponse(empWrapper);

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

//    @Override
//    public List<EmployeeWithDepartmentAndPosition> getEmployeesWithDepartmentAndPosition() {
//            return employeeMyBatisRepo.getEmployeesWithDepartmentAndPosition();
//        }
    }

