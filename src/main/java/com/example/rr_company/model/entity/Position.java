package com.example.rr_company.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Position {
    private int id;
    private String name;
    private Integer salary;
    private  Date created_at;
    private Date updated_at;
    private int department_id;

}
