package com.tdp.ms.prueba.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdp.ms.prueba.business.PersonaService;
import com.tdp.ms.prueba.model.dao.Persona;
import com.tdp.ms.prueba.repository.IPersonaRepository;

import reactor.core.publisher.Mono;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	IPersonaRepository personaRepository;
	
	@Override
	public Mono<Persona> registrar(Persona persona) {
		return null;
	}

	@Override
	public Mono<Persona> modificar(Persona persona) {
		return null;
	}

	@Override
	public Mono<List<Persona>> listar() {
		return Mono.justOrEmpty(personaRepository.findAll());
	}

	@Override
	public Mono<Persona> listarPorId(Integer id) {
		return Mono.justOrEmpty(personaRepository.findById(id));
	}

	@Override
	public void eliminar(Integer id) {
		personaRepository.deleteById(id);
	}

	

}
