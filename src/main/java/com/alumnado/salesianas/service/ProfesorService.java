package com.alumnado.salesianas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alumnado.salesianas.bean.ProfesorDTO;
import com.alumnado.salesianas.entity.ProfesorEntity;
import com.alumnado.salesianas.mapper.ProfesorMapper;
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
	
	public ProfesorDTO introducirAlumno(ProfesorDTO profesor) {
		ProfesorEntity entity = ProfesorMapper.mapToDTOEntity(profesor);
//		if(alumnoRepository.findAll().stream()
//			.filter(alum -> alumno.equals(
//					AlumnoMapper.mapToEntityResponse(alum))) == null) {
//		if(alumnoRepository.existsByNombre(entity.getNombre())) {
			profesorRepository.save(entity);
			return profesor;
//		} else {
//			throw new InternalError("Fila duplicada: el alumno ya existe en la base de datos.");
//		}
	}
	
	/**
	 * Listar profesores.
	 *
	 * @return the lista de profesores
	 */
	public List<ProfesorDTO> listarProfesores(){
		return profesorRepository.findAll().stream()
				.map(profesor -> new ProfesorDTO(profesor.getNombre()))
				.toList();
	}
}
