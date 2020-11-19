package com.tdp.ms.prueba.dto.model;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.tdp.ms.prueba.model.dao.Carrera;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AlumnoRequestDTO {

	private Integer id;
	
	private String nombre;
	
	private String apellido;

	private Integer id_carrera;

	public AlumnoRequestDTO(Integer id, String nombre, String apellido, Integer id_carrera) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.id_carrera = id_carrera;
	}
	
	
	
	
}
