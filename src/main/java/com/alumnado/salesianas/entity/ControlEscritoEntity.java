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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ControlEscritoEntity.
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

/**
 * The Class ControlEscritoEntityBuilder.
 */
@Builder
@Table(name = "CONTROL_ESCRITO", schema = "SALESIANAS")
public class ControlEscritoEntity {
	
    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    /** The numero control. */
    @Column(name = "N_CONTROL")
    private int numeroControl;
    
    /** The numero preguntas. */
    @Column(name = "N_PREGUNTAS")
    private int numeroPreguntas;
    
    /** The fecha realizacion. */
    @Column(name = "FECHA_REALIZACION")
    private Date fechaRealizacion;
    
    /** The alumno. */
    @ManyToOne
    @JoinColumn(name = "ALUMNO_ID")
    private AlumnoEntity alumno;
}
