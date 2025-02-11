package com.alumnado.salesianas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "ALUMNADO", schema = "SALESIANAS")
public class Alumnado {
	
	@Id
	@Column(name = "N_MATRICULA")
	private long nMatricula;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "GRUPO")
	private String grupo;
}
