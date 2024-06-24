package com.example.rr_company.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PositionRequest {
    private String name;
    private Integer salary;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int departmentId;
}
