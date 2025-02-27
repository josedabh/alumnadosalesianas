package com.alumnado.salesianas.mapper;

import com.alumnado.salesianas.bean.AlumnoDTO;
import com.alumnado.salesianas.entity.AlumnoEntity;

/**
 * The Class AlumnoMapper.
 */
public class AlumnoMapper {
	
	/**
	 * Metodo que convierte un entity en reponse.
	 *
	 * @param alumno the alumno
	 * @return the alumno DTO
	 */
	public static AlumnoDTO mapToEntityResponse(AlumnoEntity alumno) {
		return new AlumnoDTO(alumno.getNombre(), alumno.getGrupo());
	}
	
	/**
	 * Map to DTO entity.
	 *
	 * @param alumnoDTO the alumno DTO
	 * @return the alumno entity
	 */
	public static AlumnoEntity mapToDTOEntity(AlumnoDTO alumnoDTO) {
		AlumnoEntity entity = new AlumnoEntity();
		entity.setNombre(alumnoDTO.getNombre());
		entity.setGrupo(alumnoDTO.getGrupo());
		return entity;
	}
	
	/**
	 * Update to entity.
	 *
	 * @param id the id
	 * @param alumnoDTO the alumno DTO
	 * @return the alumno entity
	 */
	public static AlumnoEntity updateToEntity(long id,AlumnoDTO alumnoDTO) {
		AlumnoEntity entity = new AlumnoEntity();
		entity.setNMatricula(id);
		entity.setGrupo(alumnoDTO.getGrupo());
		entity.setNombre(alumnoDTO.getNombre());
		return entity;
	}

}
