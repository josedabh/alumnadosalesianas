package com.alumnado.salesianas.bean;

import java.util.Set;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class PracticaDTO.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PracticaDTO {

	/** The id. */
	@Schema(description = "ID de la práctica", example = "1")
	private Long id;

	/** The codigo. */
	@Schema(description = "Código único de la práctica", example = "PRAC001")
	private String codigo;

	/** The titulo. */
	@Schema(description = "Título de la práctica", example = "Práctica de Spring Boot")
	private String titulo;

	/** The grado dificultad. */
	@Schema(description = "Grado de dificultad", example = "MEDIA")
	private String gradoDificultad;

	/** The profesores. */
	@Schema(description = "Lista de profesores asociados")
	private Set<ProfesorDTO> profesores;
}