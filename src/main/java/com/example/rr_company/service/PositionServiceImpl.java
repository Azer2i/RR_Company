package com.example.rr_company.service;

import com.example.rr_company.mapper.MapperPosition;
import com.example.rr_company.model.dto.request.PositionRequest;
import com.example.rr_company.model.dto.response.PositionResponse;
//import com.example.rr_company.model.request.PositionRequest;
//import com.example.rr_company.model.response.PositionResponse;
import com.example.rr_company.model.entity.Position;
import com.example.rr_company.repository.PositionMyBatisRepo;
import com.example.rr_company.service.impl.PositionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class PositionServiceImpl implements PositionService {
    private final MapperPosition mapperPosition;
    private final PositionMyBatisRepo positionMyBatisRepo;

    @Override
    public List<PositionResponse> getAllPosition() {
        List<Position> allPosition = positionMyBatisRepo.getAllPosition();
        List<PositionResponse> positions = mapperPosition.toPositions(allPosition);
        return positions;

    }

    @Override
    public PositionResponse getPositionById(Long id) {
        Optional<Position> byIdPosition = positionMyBatisRepo.findByIdPosition(id);
        return byIdPosition.map(mapperPosition::toPositionById).orElse(null);

    }

    @Override
    public void addPosition(PositionRequest positionRequest) {
        log.info("add position {}",positionRequest);
        Position positionInsert = mapperPosition.toPositionInsert(positionRequest);
        log.info("PositionMappers mapped to to Position.position:{}", positionInsert);
        positionMyBatisRepo.insert(positionInsert);
        log.info("add Position success");
        log.warn("Just warning{}",positionRequest);
        log.error("Just error.{}",positionRequest);


    }

    @Override
    public void updatePosition(Long id, PositionRequest positionRequest) {
        Position positionUpdate = mapperPosition.toPositionUpdate(id, positionRequest);
        positionMyBatisRepo.update(positionUpdate);
    }

    @Override
    public void deletePosition(Long id) {
        positionMyBatisRepo.delete(id);

    }

    @Override
    public List<Position> getPositionsWithDepartments() {
        return positionMyBatisRepo.getPositionWithDepartment();
    }

}
