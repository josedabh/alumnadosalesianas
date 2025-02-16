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
public class ControlEscritoDTO {
	
    private int numeroControl;
    
    private int numeroPreguntas;
    
    private Date fechaRealizacion;
    
    private int alumno_id;
}
