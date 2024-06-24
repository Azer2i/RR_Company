package com.example.rr_company.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentRequest {
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
