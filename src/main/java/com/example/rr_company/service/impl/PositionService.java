package com.example.rr_company.service.impl;

import com.example.rr_company.model.dto.request.PositionRequest;
import com.example.rr_company.model.dto.response.PositionResponse;
//import com.example.rr_company.model.request.PositionRequest;
//import com.example.rr_company.model.response.PositionResponse;
import com.example.rr_company.model.entity.Position;

import java.util.List;

public interface PositionService {
    List<PositionResponse> getAllPosition();
    PositionResponse getPositionById(Long id);
    void addPosition(PositionRequest positionRequest);
    void updatePosition(Long id,PositionRequest positionRequest);
    void deletePosition(Long id);
    List<Position> getPositionsWithDepartments();

}
