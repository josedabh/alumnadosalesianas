package com.alumnado.salesianas.mapper;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import com.alumnado.salesianas.bean.ProfesorDTO;
import com.alumnado.salesianas.entity.ProfesorEntity;

/**
 * The Class ProfesorMapper.
 */
public class ProfesorMapper {
	
	/**
	 * Mapea de entity a response.
	 *
	 * @param entity the entity
	 * @return the profesor DTO
	 */
	public static ProfesorDTO mapToEntityResponse(ProfesorEntity entity) {
		return new ProfesorDTO(entity.getNombre());
	}
	
	/**
	 * Map to DTO entity.
	 *
	 * @param profesor the profesor
	 * @return the profesor entity
	 */
	public static ProfesorEntity mapToDTOEntity(ProfesorDTO profesor) {
		ProfesorEntity entity = new ProfesorEntity();
		entity.setNombre(profesor.getNombre());
		return entity;
	}
	
	/**
	 * Map to DTO set.
	 *
	 * @param profesores the profesores
	 * @return the sets the
	 */
	public static Set<ProfesorDTO> mapToDTOSet(Set<ProfesorEntity> profesores) {
        if (profesores == null) return new HashSet<>();
        return profesores.stream()
                .map(ProfesorMapper::mapToEntityResponse)
                .collect(Collectors.toSet());
    }
}
