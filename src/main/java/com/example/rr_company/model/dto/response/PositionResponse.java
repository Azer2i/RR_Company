package com.example.rr_company.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PositionResponse {
    private int id;
    private String name;
    private Integer salary;
    private Date created_at;
    private Date updated_at;
    private Integer department_id;
}
