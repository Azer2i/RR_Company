package com.example.rr_company.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Wrapper {
    private Long pid;
    private String pname;
    private Integer psalary;
    private LocalDateTime pcreatedAt;
    private LocalDateTime pupdatedAt;
    private Long did;
    private String dname;
    private LocalDateTime dcreatedAt;
    private LocalDateTime dupdatedAt;

}
