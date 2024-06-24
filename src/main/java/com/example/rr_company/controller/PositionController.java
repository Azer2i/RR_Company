package com.example.rr_company.controller;

import com.example.rr_company.model.dto.request.PositionRequest;
import com.example.rr_company.model.dto.response.PositionResponse;
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
        List<PositionResponse> allPositions = positionService.getAllPosition();
        return ResponseEntity.ok(allPositions);
    }

    @GetMapping("/id/{positionId}")
    public ResponseEntity<PositionResponse> getPositionById(@PathVariable("positionId") Long positionId) {
        PositionResponse positionById = positionService.getPositionById(positionId);
        return ResponseEntity.ok(positionById);
    }

    @PutMapping("/id/{positionId}")
    public ResponseEntity<Void> updatePosition(@PathVariable("positionId") Long positionId,
                                               @RequestBody PositionRequest positionRequest) {
        positionService.updatePosition(positionId, positionRequest);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Void> addPosition(@RequestBody PositionRequest positionRequest) {
        positionService.addPosition(positionRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/positionId/{position}")
    public ResponseEntity<Void> deletePositionById(@PathVariable Long position) {
        positionService.deletePosition(position);
        return ResponseEntity.ok().build();
    }
}

