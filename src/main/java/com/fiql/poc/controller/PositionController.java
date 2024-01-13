package com.fiql.poc.controller;

import com.fiql.poc.models.model.PositionModel;
import com.fiql.poc.service.PositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/positions")
public class PositionController {

    private final PositionService positionService;

    @GetMapping
    public ResponseEntity<List<PositionModel>> searchPositions(
            @RequestParam(value = "filter", required = false) final String filter) {
        final List<PositionModel> positionModelList = positionService.searchPositions(filter);
        return ResponseEntity.ok(positionModelList);
    }
}
