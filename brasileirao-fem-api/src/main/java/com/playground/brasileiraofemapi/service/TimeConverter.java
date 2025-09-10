package com.playground.brasileiraofemapi.service;

import com.playground.brasileiraofemapi.dtos.TimeResponseDTO;
import com.playground.brasileiraofemapi.infrastructure.entities.TimeEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TimeConverter {

    public TimeResponseDTO paraTimeDTO(TimeEntity entity) {

        return TimeResponseDTO.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .tecnico(entity.getTecnico())
                .local(entity.getLocal())
                .mascote(entity.getMascote())
                .build();
    }

    public List<TimeResponseDTO> paraListaTimeDTO(List<TimeEntity> entities) {

        return entities.stream()
                .map(this::paraTimeDTO)
                .toList();
    }

}
