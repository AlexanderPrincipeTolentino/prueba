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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tdp.ms.prueba.business.PersonaService;
import com.tdp.ms.prueba.model.dao.Persona;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/personas/v1")
public class PersonaController {
	
	@Autowired
	PersonaService personaService;
	
	@GetMapping("/listar")
	public Mono<List<Persona>> listar() {
		return personaService.listar();
	}
	
	@GetMapping("/listar/{id}")
	public Mono<Persona> listarPorId(@PathVariable Integer id) {
		return personaService.listarPorId(id);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Integer id) {
		personaService.eliminar(id);
	}
	
	@PutMapping("/modificar")
	public Mono<Persona> modificar(@RequestBody Persona persona) {
		return personaService.modificar(persona);
	}
	
	@PostMapping("/registrar")
	public Mono<Persona> registrar(@RequestBody Persona persona) {
		return personaService.modificar(persona);
	}


}
