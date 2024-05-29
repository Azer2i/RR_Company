package com.example.rr_company.controller;

//import com.example.rr_company.model.request.PositionRequest;
//import com.example.rr_company.model.response.PositionResponse;
import com.example.rr_company.model.dto.request.PositionRequest;
import com.example.rr_company.model.dto.response.PositionResponse;
import com.example.rr_company.model.entity.Position;
import com.example.rr_company.service.impl.PositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/position")

public class PositionController {
    private final PositionService positionService;

    @GetMapping
    public ResponseEntity<List<PositionResponse>> getAllPositions() {
        List<PositionResponse> allPosition = positionService.getAllPosition();
        return ResponseEntity.ok(allPosition);

    }

    @GetMapping("/id{id}")
    public ResponseEntity<PositionResponse> getPositionById(@PathVariable Long id) {
        PositionResponse positionById = positionService.getPositionById(id);
        return ResponseEntity.ok(positionById);

    }

    @PostMapping
    public ResponseEntity<Void> getAddPosition(@RequestBody PositionRequest positionRequest) {
        positionService.addPosition(positionRequest);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/positionId/{position}")
    public ResponseEntity<Void> deletePositionById(@PathVariable Long position) {
        positionService.deletePosition(position);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/full-data")
    public List<Position> getAllPositionsWithDepartments(){
        return positionService.getPositionsWithDepartments();
    }

}

