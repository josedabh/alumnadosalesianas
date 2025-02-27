package com.alumnado.salesianas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.alumnado.salesianas.entity.AlumnoEntity;
import com.alumnado.salesianas.entity.PracticaEntity;
import com.alumnado.salesianas.entity.PracticaRealizadaEntity;

/**
 * The Interface PracticaRealizadaRepository.
 */
public interface PracticaRealizadaRepository extends JpaRepository<PracticaRealizadaEntity, Long>{

    /**
     * Find alumnos by practica id.
     *
     * @param practicaId the practica id
     * @return the list
     */
    @Query(value = "SELECT a.* FROM practica_realizada pr " 
            + "JOIN alumno a ON pr.alumno_id = a.n_matricula "
            + "WHERE pr.practica_id = :practicaId"
            , nativeQuery = true)
    List<AlumnoEntity> findAlumnosByPracticaId(@Param("practicaId") Long practicaId);

	 /**
 	 * Find practicas by alumno id.
 	 *
 	 * @param alumnoId the alumno id
 	 * @return the list
 	 */
 	@Query(value = "SELECT p.* FROM practica p " 
            + "JOIN practica_realizada pr ON pr.practica_id = p.id "
            + "WHERE pr.alumno_id = :alumnoId"
            , nativeQuery = true)
    List<PracticaEntity> findPracticasByAlumnoId(@Param("alumnoId") Long alumnoId);
}