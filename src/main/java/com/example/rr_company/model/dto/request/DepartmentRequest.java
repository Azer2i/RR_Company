package com.example.rr_company.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentRequest {
    private String name;
    private Date created_at;
    private Date updated_at;
}