package com.alumnado.salesianas.bean;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class AlumnoDTO.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AlumnoDTO {
	
	/** The nombre. */
	@Schema(description = "el nombre", example = "Shrek")
	private String nombre;
	
	/** The grupo. */
	@Schema(description = "El grupo", example = "3º Bachillerato")
	private String grupo;
}
