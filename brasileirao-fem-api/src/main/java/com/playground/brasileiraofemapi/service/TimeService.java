package com.playground.brasileiraofemapi.service;

import com.playground.brasileiraofemapi.dtos.TimeResponseDTO;
import com.playground.brasileiraofemapi.infrastructure.entities.TimeEntity;
import com.playground.brasileiraofemapi.infrastructure.repositories.TimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TimeService {

    private final TimeRepository repository;
    private final TimeConverter converter;

    public List<TimeResponseDTO> buscar() {

        List<TimeEntity> times = repository.findAll();

        return converter.paraListaTimeDTO(times);
    }
}
