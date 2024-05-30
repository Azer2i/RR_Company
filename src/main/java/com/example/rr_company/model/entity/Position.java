package com.example.rr_company.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Position {
    private int id;
    private String name;
    private Integer salary;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private int department_id;

}
