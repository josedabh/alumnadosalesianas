package com.alumnado.salesianas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumnado.salesianas.bean.ProfesorDTO;
import com.alumnado.salesianas.service.ProfesorService;

import lombok.AllArgsConstructor;

import java.util.List; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

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
	 * Leer todos.
	 *
	 * @return the response entity
	 */
	@GetMapping()
	public ResponseEntity<List<ProfesorDTO>> leerTodos() {
		return ResponseEntity.ok(profesorService.listarProfesores());
	}
	
}
