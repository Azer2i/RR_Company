package com.example.rr_company.mapper;

import com.example.rr_company.model.dto.request.PositionRequest;
import com.example.rr_company.model.dto.response.PositionResponse;
//import com.example.rr_company.model.request.PositionRequest;
//import com.example.rr_company.model.response.PositionResponse;
import com.example.rr_company.model.entity.Position;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;
import java.util.List;

@Mapper(componentModel = "spring",imports = {LocalDateTime.class})
public interface MapperPosition {
    MapperPosition INSTANCE =Mappers.getMapper(MapperPosition.class);

    List<PositionResponse> toPositions(List<Position> positions);
    @Mapping(target = "created_at",expression = "java(LocalDateTime.now())")
    PositionResponse toPositionById(Position position);
    @Mapping(target = "updated_at",expression = "java(LocalDateTime.now())")
    Position toPositionInsert(PositionRequest positionRequest);
    Position toPositionUpdate(Long id, PositionRequest positionRequest);


}
