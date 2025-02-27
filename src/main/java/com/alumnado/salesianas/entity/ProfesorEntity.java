package com.alumnado.salesianas.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ProfesorEntity.
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "PROFESOR", schema = "SALESIANAS")
public class ProfesorEntity {

	/** The id. */
	@Id
	@Column(name = "ID")
	private long id;
	
	/** The nombre. */
	@Column(name = "NOMBRE")
	private String nombre;
	
	/** The practicas. */
	@ManyToMany(mappedBy = "profesores")
    private Set<PracticaEntity> practicas;
}
