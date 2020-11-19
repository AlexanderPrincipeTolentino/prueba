package com.tdp.ms.prueba.business.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdp.ms.prueba.business.AlumnoService;
import com.tdp.ms.prueba.dto.model.AlumnoRequestDTO;
import com.tdp.ms.prueba.model.dao.Alumno;
import com.tdp.ms.prueba.model.dao.Carrera;
import com.tdp.ms.prueba.repository.IAlumnoRepository;
import com.tdp.ms.prueba.repository.ICarrera;

import reactor.core.publisher.Mono;

@Service
public class AlumnoServiceImpl implements AlumnoService{
	
	Logger log = LoggerFactory.getLogger(AlumnoServiceImpl.class);
	
	@Autowired
	IAlumnoRepository alumnoRepository;
	
	@Autowired
	ICarrera carreraRepository;

	@Override
	public Mono<Alumno> registrar(AlumnoRequestDTO alumnoDTO) {
				
		Carrera carrera = new Carrera();
				
		carrera = carreraRepository.findById(alumnoDTO.getId_carrera()).orElse(null);
				
		Alumno alumno = new Alumno();
		
		alumno.setApellido(alumnoDTO.getApellido());
		alumno.setNombre(alumnoDTO.getNombre());
		alumno.setId(alumnoDTO.getId());
		alumno.setCarrera(carrera);
		
		return Mono.justOrEmpty(alumnoRepository.save(alumno));
	}

	@Override
	public Mono<Alumno> modificar(AlumnoRequestDTO alumnoDTO) {
		
		Carrera carrera = new Carrera();
		
		carrera = carreraRepository.findById(alumnoDTO.getId_carrera()).orElse(null);
		
		Alumno alumno = new Alumno();
		
		alumno.setApellido(alumnoDTO.getApellido());
		alumno.setNombre(alumnoDTO.getNombre());
		alumno.setId(alumnoDTO.getId());
		alumno.setCarrera(carrera);
		
		return Mono.justOrEmpty(alumnoRepository.save(alumno));
	}

	@Override
	public Mono<List<Alumno>> listar() {
		return Mono.justOrEmpty(alumnoRepository.findAll());
	}

	@Override
	public void eliminar(Integer id) {
		alumnoRepository.deleteById(id);
	}

	@Override
	public Mono<Alumno> listarPorId(Integer id) {
		return Mono.justOrEmpty(alumnoRepository.findById(id));
	}
	
	
		
	

	
	

}
