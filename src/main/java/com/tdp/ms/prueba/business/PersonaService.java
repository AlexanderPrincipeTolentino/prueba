package com.tdp.ms.prueba.business;

import java.util.List;

import com.tdp.ms.prueba.dto.model.UserRequestDTO;
import com.tdp.ms.prueba.model.dao.Persona;
import com.tdp.ms.prueba.model.dao.User;

import reactor.core.publisher.Mono;

public interface PersonaService {
	
	Mono<Persona> registrar(Persona persona);
	Mono<Persona> modificar(Persona persona);
	Mono<List<Persona>> listar();
	Mono<Persona> listarPorId(Integer id);
	void eliminar(Integer id);

}
