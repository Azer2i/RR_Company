package com.example.rr_company.repository;

import com.example.rr_company.model.entity.Position;
import com.example.rr_company.model.entity.Wrapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PositionMyBatisRepo {
    List<Wrapper> getAllPosition();
    Wrapper findByIdPosition(@Param("id") Long id);
    void insert(Position position);
    void update(Position position);
    void delete(@Param("id") Long id);
//    List<Position> getPositionWithDepartment();



}
