package com.alumnado.salesianas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alumnado.salesianas.entity.AlumnoEntity;

/**
 * The Interface AlumnoRepository.
 */
public interface AlumnoRepository extends JpaRepository<AlumnoEntity, Long> {
	 boolean existsByNombre(String nombre);
}
