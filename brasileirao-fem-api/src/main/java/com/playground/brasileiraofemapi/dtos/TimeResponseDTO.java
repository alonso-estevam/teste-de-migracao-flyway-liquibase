package com.playground.brasileiraofemapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TimeResponseDTO {

    private Long id;
    private String nome;
    private String tecnico;
    private String local;
    private String mascote;

}
