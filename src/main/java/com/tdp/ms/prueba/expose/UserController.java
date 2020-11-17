package com.tdp.ms.prueba.expose;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tdp.ms.prueba.business.PruebaService;
import com.tdp.ms.prueba.business.UserService;
import com.tdp.ms.prueba.dto.model.UserRequestDTO;
import com.tdp.ms.prueba.model.PersonaResponse;
import com.tdp.ms.prueba.model.PruebaResponse;
import com.tdp.ms.prueba.model.dao.User;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/prueba/v1")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/modificar")
	public Mono<User> modificar(@RequestBody UserRequestDTO user) {
		return userService.modificar(user);
	}
	
	@PostMapping("/registrar")
	public Mono<User> registrar(@RequestBody UserRequestDTO user) {
		return userService.registrar(user);
	}
	
	@GetMapping("/listar")
	public Mono<List<User>> listar() {
		return userService.listar();
	}
	
	@GetMapping("/listar/{id}")
	public Mono<User> listarPorId(@RequestParam Integer id) {
		return userService.listarPorId(id);
	}
	
	
	
}
