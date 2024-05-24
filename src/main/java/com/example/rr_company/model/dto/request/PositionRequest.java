package com.example.rr_company.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PositionRequest {
    private String name;
    private Integer salary;
    private Date created_at;
    private Date updated_at;
    private int department_id;
}
