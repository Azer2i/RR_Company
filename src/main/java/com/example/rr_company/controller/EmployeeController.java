package com.example.rr_company.controller;

import com.example.rr_company.model.dto.request.EmployeeRequest;
import com.example.rr_company.model.dto.response.EmployeeResponse;
//import com.example.rr_company.model.request.EmployeeRequest;
//import com.example.rr_company.model.response.EmployeeResponse;
import com.example.rr_company.service.impl.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<EmployeeResponse>> getAllEmployees() {
        List<EmployeeResponse> getAlls = employeeService.allEmployee();
        return ResponseEntity.ok(getAlls);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeById(@PathVariable Long id) {
        EmployeeResponse employeeById = employeeService.findEmployeeById(id);
        return ResponseEntity.ok(employeeById);
    }

    @PostMapping
    public ResponseEntity<Void> insertEmployee(@RequestBody EmployeeRequest employeeRequest) {
        employeeService.insertEmployee(employeeRequest);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/id/{id}")
    public ResponseEntity<Void> updateEmployoee(@PathVariable("id") Long id,
                                                @RequestBody EmployeeRequest employeeRequest) {
        employeeService.UpdateEmployee(id, employeeRequest);
        return ResponseEntity.ok().build();
    }

    }

