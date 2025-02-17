package com.alumnado.salesianas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alumnado.salesianas.bean.ProfesorDTO;
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
