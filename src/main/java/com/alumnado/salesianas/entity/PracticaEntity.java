package com.alumnado.salesianas.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class PracticaEntity.
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "PRACTICA", schema = "SALESIANAS")
public class PracticaEntity {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	/** The codigo. */
	@Column(name = "CODIGO")
	private String codigo;
	
	/** The titulo. */
	@Column(name = "TITULO")
	private String titulo;
	
	/** The grado dificultad. */
	@Column(name = "GRADO_DIFICULTAD")
	private String gradoDificultad;

	/** The profesores. */
	@ManyToMany
	@JoinTable(name = "PRACTICA_PROFESOR",
	joinColumns = @JoinColumn(name = "PRACTICA_ID"),
	inverseJoinColumns = @JoinColumn(name = "PROFESOR_ID"))
	private Set<ProfesorEntity> profesores;
}
