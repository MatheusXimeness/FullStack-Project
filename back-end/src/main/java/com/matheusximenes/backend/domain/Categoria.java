package com.matheusximenes.backend.domain;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String nome;

}
