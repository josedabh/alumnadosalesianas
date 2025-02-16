package com.alumnado.salesianas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.alumnado.salesianas.bean.AlumnoDTO;
import com.alumnado.salesianas.mapper.AlumnoUtil;
import com.alumnado.salesianas.repository.AlumnoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AlumnoService {
	
	private AlumnoRepository alumnoRepository;
	
	//Prueba de listar alumnos
	public List<AlumnoDTO> listaAlumnos(){
		return alumnoRepository.findAll().stream()
				.map(alumno -> AlumnoUtil.mapToEntityResponse(alumno))
				.collect(Collectors.toList());
	}

}
