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
@Table(name = "PROFESOR", schema = "SALESIANAS")
public class ProfesorEntity {

	@Id
	@Column(name = "ID")
	private long id;
	
	@Column(name = "NOMBRE")
	private String nombre;
}
