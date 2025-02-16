package com.alumnado.salesianas.bean;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PracticaDTO {
	
	private String codigo;
	
	private String titulo;
	
	private String gradoDificultad;

	private Set<ProfesorDTO> profesores;
}
