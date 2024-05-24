package com.example.rr_company.repository;

import com.example.rr_company.model.entity.Position;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PositionMyBatisRepo {
    List<Position> getAllPosition();
    Optional<Position> findByIdPosition(@Param("id") Long id);
    void insert(Position position);
    void update(Position position);
    void delete(@Param("id") Long id);
    List<Position> getPositionWithDepartment();


}
