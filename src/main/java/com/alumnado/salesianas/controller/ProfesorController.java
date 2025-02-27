package com.alumnado.salesianas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumnado.salesianas.bean.ProfesorDTO;
import com.alumnado.salesianas.service.ProfesorService;

import lombok.AllArgsConstructor;

import java.util.List; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * The Class ProfesorController.
 */
@RestController
@AllArgsConstructor
@RequestMapping("api/profesor")
public class ProfesorController {

	/** The profesor service. */
	private ProfesorService profesorService;
	
	/**
	 * Crear profesor.
	 *
	 * @param profesor the profesor
	 * @return the response entity
	 */
	@PostMapping
	public ResponseEntity<ProfesorDTO> crearProfesor(@RequestBody ProfesorDTO profesor){
		return ResponseEntity.ok(profesorService.introducirAlumno(profesor));
	}

	/**
	 * Asociar practica.
	 *
	 * @param profesorId the profesor id
	 * @param practicaId the practica id
	 * @return the response entity
	 */
	public ResponseEntity<Void> asociarPractica(@PathVariable Long profesorId,
         @PathVariable Long practicaId) {
    profesorService.asociarPractica(profesorId, practicaId);
    return ResponseEntity.ok().build();
	}
	
	/**
	 * Leer todos los profesores.
	 *
	 * @return the response entity
	 */
	@GetMapping
	public ResponseEntity<List<ProfesorDTO>> leerTodos() {
		return ResponseEntity.ok(profesorService.listarProfesores());
	}
	
}
