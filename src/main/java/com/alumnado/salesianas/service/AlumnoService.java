package com.alumnado.salesianas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.alumnado.salesianas.bean.AlumnoDTO;
import com.alumnado.salesianas.bean.PracticaDTO;
import com.alumnado.salesianas.entity.AlumnoEntity;
import com.alumnado.salesianas.entity.PracticaEntity;
import com.alumnado.salesianas.mapper.AlumnoMapper;
import com.alumnado.salesianas.mapper.PracticaMapper;
import com.alumnado.salesianas.repository.AlumnoRepository;
import com.alumnado.salesianas.repository.PracticaRealizadaRepository;
import com.alumnado.salesianas.repository.PracticaRepository;

import lombok.AllArgsConstructor;

/**
 * The Class AlumnoService.
 */
@Service
@AllArgsConstructor
public class AlumnoService {
	
	/** The alumno repository. */
	private AlumnoRepository alumnoRepository;
	
	/** The practica realizada repository. */
	private PracticaRealizadaRepository practicaRealizadaRepository;

	/** The practica repository. */
	private PracticaRepository practicaRepository;
	
	/**
	 * Introducir alumno.
	 *
	 * @param alumno the alumno
	 * @return the alumno DTO
	 */
	public AlumnoDTO introducirAlumno(AlumnoDTO alumno) {
	    AlumnoEntity entity = AlumnoMapper.mapToDTOEntity(alumno);
	    
	    if(alumnoRepository.existsByNombre(entity.getNombre())) {
	        throw new InternalError("Fila duplicada: el alumno ya existe en la base de datos.");
	    } else {
	        alumnoRepository.save(entity);
	        return alumno;
	    }
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
	
	/**
	 * Update alumno.
	 *
	 * @param idAlumno the id alumno
	 * @param alumno the alumno
	 * @return the alumno DTO
	 */
	public AlumnoDTO updateAlumno(long idAlumno, AlumnoDTO alumno) {
		boolean existe = alumnoRepository.findById(idAlumno).isPresent();
		if(existe) {
			AlumnoEntity entity = AlumnoMapper.updateToEntity(idAlumno, alumno);
			alumnoRepository.save(entity);
			return alumno;
		} else {
			throw new NullPointerException("No existe alumno con ese numero matricula");
		}
	}
	
	/**
	 * Obtener alumnos por practica.
	 *
	 * @param practicaId the practica id
	 * @return the list
	 */
	public List<AlumnoEntity> obtenerAlumnosPorPractica(Long practicaId) {
		// Verificar si la práctica existe
		if(!practicaRepository.existsById(practicaId)) {
			throw new RuntimeException("No existe una práctica con el ID: " + practicaId);
		}
		return practicaRealizadaRepository.findAlumnosByPracticaId(practicaId);
	}
	
	/**
	 * Obtener practicas por alumno.
	 *
	 * @param alumnoId the alumno id
	 * @return the list
	 */
	public List<PracticaDTO> obtenerPracticasPorAlumno(Long alumnoId) {
	       if(!alumnoRepository.existsById(alumnoId)) {
	           throw new RuntimeException("No existe un alumno con el ID: " + alumnoId);
	       }
	       List<PracticaEntity> practicas = practicaRealizadaRepository.findPracticasByAlumnoId(alumnoId);
	       return PracticaMapper.mapToDTOList(practicas);
	}
	
}