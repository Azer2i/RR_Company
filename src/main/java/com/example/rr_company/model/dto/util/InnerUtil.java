package com.example.rr_company.model.dto.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InnerUtil {
    private Long id;
    private String name;
    private int salary;
    private Date created_at;
    private Date updated_at;
    private Long departmentId;
    private String departmentName;
    private Date departmentCreatedAt;
    private Date departmentUpdatedAt;
}
