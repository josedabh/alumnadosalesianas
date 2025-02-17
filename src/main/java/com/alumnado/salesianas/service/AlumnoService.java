package com.alumnado.salesianas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.alumnado.salesianas.bean.AlumnoDTO;
import com.alumnado.salesianas.entity.AlumnoEntity;
import com.alumnado.salesianas.mapper.AlumnoMapper;
import com.alumnado.salesianas.repository.AlumnoRepository;

import lombok.AllArgsConstructor;

/**
 * The Class AlumnoService.
 */
@Service
@AllArgsConstructor
public class AlumnoService {
	
	/** The alumno repository. */
	private AlumnoRepository alumnoRepository;
	
	/**
	 * Introducir alumno.
	 *
	 * @param alumno the alumno
	 * @return the alumno DTO
	 */
	public AlumnoDTO introducirAlumno(AlumnoDTO alumno) {
		AlumnoEntity entity = AlumnoMapper.maptoDTOEntity(alumno);
//		if(alumnoRepository.findAll().stream()
//			.filter(alum -> alumno.equals(
//					AlumnoMapper.mapToEntityResponse(alum))) == null) {
//		if(alumnoRepository.existsByNombre(entity.getNombre())) {
			alumnoRepository.save(entity);
			return alumno;
//		} else {
//			throw new InternalError("Fila duplicada: el alumno ya existe en la base de datos.");
//		}
	}
	
	/**
	 * Lista alumnos.
	 *
	 * @return the lista alumnos
	 */
	public List<AlumnoDTO> listaAlumnos(){
		return alumnoRepository.findAll().stream()
				.map(alumno -> AlumnoMapper.mapToEntityResponse(alumno))
				.collect(Collectors.toList());
	}
	

}
