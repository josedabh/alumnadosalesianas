package com.alumnado.salesianas.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumnado.salesianas.bean.AlumnoDTO;
import com.alumnado.salesianas.service.AlumnoService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/alumno")
public class AlumnoController {
	
	private AlumnoService alumnoService;

	@GetMapping
	public ResponseEntity<List<AlumnoDTO>> listarAlumnos(){
		return ResponseEntity.ok(alumnoService.listaAlumnos());
	}
}
