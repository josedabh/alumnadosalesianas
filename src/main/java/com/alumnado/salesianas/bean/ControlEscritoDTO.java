package com.alumnado.salesianas.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ControlEscritoDTO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ControlEscritoDTO {
	
    /** The numero control. */
    private int numeroControl;
    
    /** The numero preguntas. */
    private int numeroPreguntas;
    
    /** The fecha realizacion. */
    private Date fechaRealizacion;
    
    /** The alumno id. */
    private int alumno_id;
}
