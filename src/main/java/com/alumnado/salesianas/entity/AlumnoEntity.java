package com.alumnado.salesianas.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class AlumnoEntity.
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "ALUMNO", schema = "SALESIANAS")
public class AlumnoEntity {
    
    /** The numero de matricula. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "N_MATRICULA", updatable = false, nullable = false)
    private Long nMatricula;  
    
    /** The nombre. */
    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String nombre;
    
    /** The grupo. */
    @Column(name = "GRUPO", nullable = false, length = 50)
    private String grupo;
    
    /** The controles escritos. */
    @OneToMany(mappedBy = "alumno")
    private List<ControlEscritoEntity> controlesEscritos;

    /** The practicas realizadas. */
    @OneToMany(mappedBy = "alumno")
    private List<PracticaRealizadaEntity> practicasRealizadas;
}

