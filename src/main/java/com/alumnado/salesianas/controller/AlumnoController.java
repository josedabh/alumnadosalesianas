package com.alumnado.salesianas.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PostMapping
	public ResponseEntity<AlumnoDTO> createAlumno(@RequestBody AlumnoDTO alumnoDTO){
		return ResponseEntity.ok(alumnoService.introducirAlumno(alumnoDTO));
	}
	
	@GetMapping
	public ResponseEntity<List<AlumnoDTO>> listarAlumnos(){
		return ResponseEntity.ok(alumnoService.listaAlumnos());
	}
	
	@PutMapping("/{idAlumno}")
	public ResponseEntity<AlumnoDTO> updateAlumno(@PathVariable
			long idAlumno, @RequestBody AlumnoDTO alumnoDTO){
		return ResponseEntity.ok(alumnoService.updateAlumno(idAlumno, alumnoDTO));
	}
}
