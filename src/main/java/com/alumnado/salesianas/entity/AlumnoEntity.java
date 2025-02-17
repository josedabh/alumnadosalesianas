package com.alumnado.salesianas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@Table(name = "ALUMNO", schema = "SALESIANAS")
public class AlumnoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "N_MATRICULA", updatable = false, nullable = false)
    private Long nMatricula;  
    
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;
    
    @Column(name = "GRUPO", nullable = false)
    private String grupo;
}

