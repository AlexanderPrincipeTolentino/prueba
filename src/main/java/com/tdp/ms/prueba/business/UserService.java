package com.tdp.ms.prueba.business;

import java.util.List;
import java.util.Optional;

import com.tdp.ms.prueba.dto.model.UserRequestDTO;
import com.tdp.ms.prueba.model.dao.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
	
	Mono<User> registrar(UserRequestDTO userDTO);
	Mono<User> modificar(UserRequestDTO userDTO);
	Mono<List<User>> listar();
	Mono<User> listarPorId(Integer id);
//	Mono<Void> eliminar(Integer id);


}
