package com.playground.brasileiraofemapi.infrastructure.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_time")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "tecnico")
    private String tecnico;

    @Column(name = "localidade")
    private String local;

    @Column(name = "mascote")
    private String mascote;

}
