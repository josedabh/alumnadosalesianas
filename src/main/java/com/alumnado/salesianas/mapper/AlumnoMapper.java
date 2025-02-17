package com.alumnado.salesianas.mapper;

import com.alumnado.salesianas.bean.AlumnoDTO;
import com.alumnado.salesianas.entity.AlumnoEntity;

public class AlumnoMapper {
	
	/**
	 * Metodo que convierte un entity en reponse
	 */
	public static AlumnoDTO mapToEntityResponse(AlumnoEntity alumno) {
		return new AlumnoDTO(alumno.getNombre(), alumno.getGrupo());
	}
	
	public static AlumnoEntity maptoDTOEntity(AlumnoDTO alumnoDTO) {
		AlumnoEntity entity = new AlumnoEntity();
		entity.setNombre(alumnoDTO.getNombre());
		entity.setGrupo(alumnoDTO.getGrupo());
		return entity;
	}

}
