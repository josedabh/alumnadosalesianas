package com.alumnado.salesianas.mapper;

import com.alumnado.salesianas.bean.AlumnoDTO;
import com.alumnado.salesianas.entity.AlumnoEntity;

public class AlumnoUtil {
	
	/**
	 * Metodo que convierte un entity en reponse
	 */
	public static AlumnoDTO mapToEntityResponse(AlumnoEntity alumno) {
		return new AlumnoDTO(alumno.getNombre(), alumno.getGrupo());
	}

}
