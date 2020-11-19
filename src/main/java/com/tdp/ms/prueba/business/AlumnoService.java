package com.tdp.ms.prueba.business;

import java.util.List;

import com.tdp.ms.prueba.dto.model.AlumnoRequestDTO;
import com.tdp.ms.prueba.model.dao.Alumno;

import reactor.core.publisher.Mono;

public interface AlumnoService {
	
	Mono<Alumno> registrar(AlumnoRequestDTO alumnoDTO);
	Mono<Alumno> modificar(AlumnoRequestDTO alumnoDTO);
	Mono<List<Alumno>> listar();
	Mono<Alumno> listarPorId(Integer id);
	void eliminar(Integer id);

}
