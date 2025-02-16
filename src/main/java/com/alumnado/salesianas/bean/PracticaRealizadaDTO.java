package com.alumnado.salesianas.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PracticaRealizadaDTO {

    private Long id;
	
    private Date fecha;
	
    private Double nota;
    
    private int alumno_id;
    
    private int practica_id;
}
