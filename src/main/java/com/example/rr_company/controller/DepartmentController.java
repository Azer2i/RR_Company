package com.example.rr_company.controller;

import com.example.rr_company.model.dto.request.DepartmentRequest;
import com.example.rr_company.model.dto.response.DepartmentResponse;
import com.example.rr_company.service.impl.DepartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/department")
public class DepartmentController {
    private final DepartService departService;


    @GetMapping
    public ResponseEntity<List<DepartmentResponse>> getAllDepartments() {
        List<DepartmentResponse> allDepartments = departService.getAllDepartments();
        return ResponseEntity.ok(allDepartments);
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<DepartmentResponse>getDepartmentById(@PathVariable Long id) {
        DepartmentResponse departmentById = departService.getDepartmentById(id);
        return ResponseEntity.ok(departmentById);

    }
    @PostMapping
    ResponseEntity<Void> insertDepartment(@RequestBody DepartmentRequest departmentRequest) {
        departService.addDepartment(departmentRequest);
        return ResponseEntity.ok().build();

    }
    @PutMapping("/id/{departmentId}")
    ResponseEntity<Void> updateDepartment(@PathVariable("departmentId") Long departmentId,
                                          @RequestBody DepartmentRequest departmentRequest) {
        departService.updateDepartment(departmentId, departmentRequest);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/departmentId/{departmentId}")
    ResponseEntity<Void> deleteDepartment(@PathVariable("departmentId") Long departmentId) {
        departService.deleteDepartment(departmentId);
        return ResponseEntity.ok().build();
    }



}
