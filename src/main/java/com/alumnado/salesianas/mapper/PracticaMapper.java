package com.alumnado.salesianas.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.alumnado.salesianas.bean.PracticaDTO;
import com.alumnado.salesianas.entity.PracticaEntity;

/**
 * The Class PracticaMapper.
 */
public class PracticaMapper {
    
    /**
     * Map to DTO.
     *
     * @param practica the practica
     * @return the practica DTO
     */
    public static PracticaDTO mapToDTO(PracticaEntity practica) {
        return PracticaDTO.builder()
                .id(practica.getId())
                .codigo(practica.getCodigo())
                .titulo(practica.getTitulo())
                .gradoDificultad(practica.getGradoDificultad())
                .profesores(ProfesorMapper.mapToDTOSet(practica.getProfesores()))
                .build();
    }

    /**
     * Map to DTO list.
     *
     * @param practicas the practicas
     * @return the list
     */
    public static List<PracticaDTO> mapToDTOList(List<PracticaEntity> practicas) {
        return practicas.stream()
                .map(PracticaMapper::mapToDTO)
                .collect(Collectors.toList());
    }
}