package com.alumnado.salesianas.mapper;

import com.alumnado.salesianas.bean.ProfesorDTO;
import com.alumnado.salesianas.entity.ProfesorEntity;

public class ProfesorMapper {
	
	/**
	 * Mapea de entity a response
	 */
	public static ProfesorDTO mapToEntityResponse(ProfesorEntity entity) {
		return new ProfesorDTO(entity.getNombre());
	}
	
	public static ProfesorEntity mapToDTOEntity(ProfesorDTO profesor) {
		ProfesorEntity entity = new ProfesorEntity();
		entity.setNombre(profesor.getNombre());
		return entity;
	}
}
