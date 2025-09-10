package com.playground.brasileiraofemapi.controller;

import com.playground.brasileiraofemapi.dtos.TimeResponseDTO;
import com.playground.brasileiraofemapi.service.TimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/times")
@RequiredArgsConstructor
public class TimesController {

    private final TimeService service;

    @GetMapping
    public ResponseEntity<List<TimeResponseDTO>> buscarTodosTimes() {

        return ResponseEntity.ok(service.buscar());
    }

}
