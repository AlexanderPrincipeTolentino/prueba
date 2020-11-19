package com.tdp.ms.prueba.expose;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tdp.ms.prueba.business.AlumnoService;
import com.tdp.ms.prueba.dto.model.AlumnoRequestDTO;
import com.tdp.ms.prueba.model.dao.Alumno;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
public class AlumnoController {
	
	@Autowired
	AlumnoService alumnoService;
	
	@PostMapping("/registrar")
	public Mono<Alumno> registrar(@RequestBody AlumnoRequestDTO alumnoDTO) {
		return alumnoService.registrar(alumnoDTO);
	}
	
	@PutMapping("/modificar")
	public Mono<Alumno> modificar(@RequestBody AlumnoRequestDTO alumnoDTO) {
		return alumnoService.modificar(alumnoDTO);
	}
	
	@GetMapping("/listar")
	public Mono<List<Alumno>> listar() {
		return alumnoService.listar();
	}
	
	@GetMapping("/listar/{id}")
	public Mono<Alumno> listarPorId(@PathVariable Integer id) {
		return alumnoService.listarPorId(id);
	}

	@DeleteMapping("/borrar/{id}")
	public void eliminar(@PathVariable Integer id) {
		alumnoService.eliminar(id);
	}
	
	
	

}
