package com.alumnado.salesianas.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumnado.salesianas.bean.AlumnoDTO;
import com.alumnado.salesianas.bean.PracticaDTO;
import com.alumnado.salesianas.entity.AlumnoEntity;
import com.alumnado.salesianas.mapper.AlumnoMapper;
import com.alumnado.salesianas.service.AlumnoService;

import lombok.AllArgsConstructor;

/**
 * The Class AlumnoController.
 */
@RestController
@AllArgsConstructor
@RequestMapping("api/alumno")
public class AlumnoController {

	/** The alumno service. */
	private AlumnoService alumnoService;

	/**
	 * Creates the alumno.
	 *
	 * @param alumnoDTO the alumno DTO
	 * @return the response entity
	 */
	@PostMapping("/crear")
	public ResponseEntity<AlumnoDTO> createAlumno(@RequestBody AlumnoDTO alumnoDTO) {
		return ResponseEntity.ok(alumnoService.introducirAlumno(alumnoDTO));
	}

	/**
	 * Listar alumnos.
	 *
	 * @return the response entity
	 */
	@GetMapping("/listar")
	public ResponseEntity<List<AlumnoDTO>> listarAlumnos() {
		return ResponseEntity.ok(alumnoService.listaAlumnos());
	}

	/**
	 * Update alumno.
	 *
	 * @param idAlumno  the id alumno
	 * @param alumnoDTO the alumno DTO
	 * @return the response entity
	 */
	@PutMapping("/{idAlumno}")
	public ResponseEntity<AlumnoDTO> updateAlumno(@PathVariable long idAlumno, @RequestBody AlumnoDTO alumnoDTO) {
		return ResponseEntity.ok(alumnoService.updateAlumno(idAlumno, alumnoDTO));
	}

	/**
	 * Obtener alumnos por practica.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	@GetMapping("/practica/{id}")
	public ResponseEntity<List<AlumnoDTO>> obtenerAlumnosPorPractica(@PathVariable Long id) {
		List<AlumnoEntity> alumnos = alumnoService.obtenerAlumnosPorPractica(id);
		if (alumnos.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		List<AlumnoDTO> alumnosDTO = alumnos.stream()
				.map(AlumnoMapper::mapToEntityResponse)
				.collect(Collectors.toList());
		return ResponseEntity.ok(alumnosDTO);
	}

	/**
	 * Obtener practicas por alumno.
	 *
	 * @param alumnoId the alumno id
	 * @return the response entity
	 */
	@GetMapping("/{alumnoId}/practicas")
	public ResponseEntity<List<PracticaDTO>> obtenerPracticasPorAlumno(@PathVariable Long alumnoId) {
		List<PracticaDTO> practicas = alumnoService.obtenerPracticasPorAlumno(alumnoId);
		if (practicas.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(practicas);
	}
}
