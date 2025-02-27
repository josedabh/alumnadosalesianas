package com.alumnado.salesianas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alumnado.salesianas.bean.ProfesorDTO;
import com.alumnado.salesianas.entity.PracticaEntity;
import com.alumnado.salesianas.entity.ProfesorEntity;
import com.alumnado.salesianas.mapper.ProfesorMapper;
import com.alumnado.salesianas.repository.PracticaRepository;
import com.alumnado.salesianas.repository.ProfesorRepository;

import lombok.AllArgsConstructor;

/**
 * The Class ProfesorService.
 */
@Service
@AllArgsConstructor
public class ProfesorService {

	/** The profesor repository. */
	private ProfesorRepository profesorRepository;

	/** The practica repository. */
	private PracticaRepository practicaRepository;

	/**
	 * Introducir alumno.
	 *
	 * @param profesor the profesor
	 * @return the profesor DTO
	 */
	public ProfesorDTO introducirAlumno(ProfesorDTO profesor) {
		ProfesorEntity entity = ProfesorMapper.mapToDTOEntity(profesor);
		// if(alumnoRepository.findAll().stream()
		// .filter(alum -> alumno.equals(
		// AlumnoMapper.mapToEntityResponse(alum))) == null) {
		// if(alumnoRepository.existsByNombre(entity.getNombre())) {
		profesorRepository.save(entity);
		return profesor;
		// } else {
		// throw new InternalError("Fila duplicada: el alumno ya existe en la base de
		// datos.");
		// }
	}

	/**
	 * Listar profesores.
	 *
	 * @return the lista de profesores
	 */
	public List<ProfesorDTO> listarProfesores() {
		return profesorRepository.findAll().stream()
				.map(profesor -> new ProfesorDTO(profesor.getNombre()))
				.toList();
	}

	/**
	 * Asociar practica.
	 *
	 * @param profesorId the profesor id
	 * @param practicaId the practica id
	 */
	public void asociarPractica(Long profesorId, Long practicaId) {
		ProfesorEntity profesor = profesorRepository.findById(profesorId)
				.orElseThrow(() -> new RuntimeException("Profesor no encontrado con ID: " + profesorId));

		PracticaEntity practica = practicaRepository.findById(practicaId)
				.orElseThrow(() -> new RuntimeException("Práctica no encontrada con ID: " + practicaId));

		profesor.getPracticas().add(practica);
		practica.getProfesores().add(profesor);

		profesorRepository.save(profesor);
	}
}
