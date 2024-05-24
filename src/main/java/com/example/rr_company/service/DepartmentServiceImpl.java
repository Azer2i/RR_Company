package com.example.rr_company.service;

import com.example.rr_company.mapper.MapperDepart;
import com.example.rr_company.model.dto.request.DepartmentRequest;
import com.example.rr_company.model.dto.response.DepartmentResponse;
//import com.example.rr_company.model.request.DepartmentRequest;
//import com.example.rr_company.model.response.DepartmentResponse;
import com.example.rr_company.model.entity.Department;
import com.example.rr_company.repository.DepartmentMyBatisRepo;
import com.example.rr_company.service.impl.DepartService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartService {
    private final MapperDepart mapperDepart;
    private final DepartmentMyBatisRepo departmentMyBatisRepo;

    @Override
    public List<DepartmentResponse> getAllDepartments() {
        List<Department> departments = departmentMyBatisRepo.FindAll();
        List<DepartmentResponse> departmentResponse = mapperDepart.toDepartmentResponse(departments);
        return departmentResponse;


    }

    @Override
    public DepartmentResponse getDepartmentById(Long id) {
        Optional<Department> departmentOptional = departmentMyBatisRepo.FindById(id);
        return departmentOptional.map(mapperDepart::toDepartmentResponseId).orElse(null);
    }

    @Override
    public void addDepartment(DepartmentRequest departmentRequest) {
        log.info("add department {}", departmentRequest);
        Department departments = mapperDepart.toDepartment(departmentRequest);
        log.info("deparmentMapper mapped to to Department.department:{}", departments);
        departmentMyBatisRepo.insert(departments);
        log.info("add department success");
        log.warn("Just warning{}",departmentRequest);
        log.error("Just error.{}",departmentRequest);
    }

    @Override
    public void updateDepartment(Long id, DepartmentRequest departmentRequest) {
        Department department = mapperDepart.toDepartmentById(id, departmentRequest);
        departmentMyBatisRepo.update(department);
    }

    @Override
    public void deleteDepartment(Long departmentId) {
        departmentMyBatisRepo.delete(departmentId);
    }


}
