package com.alumnado.salesianas.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class PracticaRealizadaDTO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PracticaRealizadaDTO {

    /** The id. */
    private Long id;
	
    /** The fecha. */
    private Date fecha;
	
    /** The nota. */
    private Double nota;
    
    /** The alumno id. */
    private int alumno_id;
    
    /** The practica id. */
    private int practica_id;
}
