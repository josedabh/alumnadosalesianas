package com.alumnado.salesianas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumnado.salesianas.bean.ProfesorDTO;
import com.alumnado.salesianas.service.ProfesorService;

import lombok.AllArgsConstructor;

import java.util.List; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@PostMapping
	public ResponseEntity<ProfesorDTO> crearProfesor(@RequestBody ProfesorDTO profesor){
		return ResponseEntity.ok(profesorService.introducirAlumno(profesor));
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
