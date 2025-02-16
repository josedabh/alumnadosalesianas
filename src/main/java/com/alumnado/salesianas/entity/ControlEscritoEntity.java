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

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "CONTROL_ESCRITO", schema = "SALESIANAS")
public class ControlEscritoEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "N_CONTROL")
    private int numeroControl;
    
    @Column(name = "N_PREGUNTAS")
    private int numeroPreguntas;
    
    @Column(name = "FECHA_REALIZACION")
    private Date fechaRealizacion;
    
    @ManyToOne
    @JoinColumn(name = "ALUMNO_ID")
    private AlumnoEntity alumno;
}
