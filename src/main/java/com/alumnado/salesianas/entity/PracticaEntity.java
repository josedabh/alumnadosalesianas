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

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "PRACTICA", schema = "SALESIANAS")
public class PracticaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "CODIGO")
	private String codigo;
	
	@Column(name = "TITULO")
	private String titulo;
	
	@Column(name = "GRADO_DIFICULTAD")
	private String gradoDificultad;

	@ManyToMany
	@JoinTable(name = "PRACTICA_PROFESOR",
	joinColumns = @JoinColumn(name = "PRACTICA_ID"),
	inverseJoinColumns = @JoinColumn(name = "PROFESOR_ID"))
	private Set<ProfesorEntity> profesores;
}
