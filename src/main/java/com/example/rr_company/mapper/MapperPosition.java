package com.example.rr_company.mapper;

import com.example.rr_company.model.dto.request.PositionRequest;
import com.example.rr_company.model.dto.response.PositionResponse;
import com.example.rr_company.model.entity.Position;
import com.example.rr_company.model.entity.Wrapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDateTime;
import java.util.List;

@Mapper(componentModel = "spring", imports = {LocalDateTime.class})
public interface MapperPosition {
//    MapperPosition INSTANCE = Mappers.getMapper(MapperPosition.class);

    @Mapping(target = "id", source = "pid")
    @Mapping(target = "name", source = "pname")
    @Mapping(target = "salary", source = "psalary")
    @Mapping(target = "createdAt", source = "pcreatedAt")
    @Mapping(target = "updatedAt", source = "pupdatedAt")
    @Mapping(target = "department.id",source = "did")
    @Mapping(target = "department.name",source = "dname")
    @Mapping(target = "department.createdAt",source = "dcreatedAt")
    @Mapping(target = "department.updatedAt",source = "dupdatedAt")
//    @Mapping(target = "departmentId", source = "departmentId")
//    @Mapping(target = "departmentName", source = "depname") // Assuming you want to map department name
    PositionResponse toPositionById(Wrapper wrapper);
    @Mapping(target = "id", source = "pid")
    @Mapping(target = "name", source = "pname")
    @Mapping(target = "salary", source = "psalary")
    @Mapping(target = "createdAt", source = "pcreatedAt")
    @Mapping(target = "updatedAt", source = "pupdatedAt")
    @Mapping(target = "department.id",source = "did")
    @Mapping(target = "department.name",source = "dname")
    @Mapping(target = "department.createdAt",source = "dcreatedAt")
    @Mapping(target = "department.updatedAt",source = "dupdatedAt")
    List<PositionResponse> toPositionList(List<Wrapper> wrapperList);

    @Mapping(target = "createdAt", expression = "java(LocalDateTime.now())")
    Position toPositionInsert(PositionRequest positionRequest);

    @Mapping(target = "updatedAt", expression = "java(LocalDateTime.now())")
    Position toPositionUpdate(Long id, PositionRequest positionRequest);
}

