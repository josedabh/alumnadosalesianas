package com.alumnado.salesianas.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class PracticaRealizadaEntity.
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "PRACTICA_REALIZADA", schema = "SALESIANAS")
public class PracticaRealizadaEntity {

	/** The id. */
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Long id;
	
	/** The fecha. */
	@Column(name = "FECHA")
	@Temporal(TemporalType.DATE)
    private Date fecha;
	
	/** The nota. */
	@Column(name = "NOTA")
    private Double nota;

    /** The alumno. */
    @ManyToOne
    @JoinColumn(name = "ALUMNO_ID")
    private AlumnoEntity alumno;
    
    /** The practica. */
    @ManyToOne
    @JoinColumn(name = "practica_id")
    private PracticaEntity practica;
}
