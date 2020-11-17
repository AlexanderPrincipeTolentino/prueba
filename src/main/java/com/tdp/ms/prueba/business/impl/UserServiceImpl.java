package com.tdp.ms.prueba.business.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.tdp.ms.prueba.business.UserService;
import com.tdp.ms.prueba.dto.model.UserRequestDTO;
import com.tdp.ms.prueba.model.dao.CasoRegistrado;
import com.tdp.ms.prueba.model.dao.User;
import com.tdp.ms.prueba.repository.ICasoRegistrado;
import com.tdp.ms.prueba.repository.IUserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService{
	
	Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	IUserRepository userRepository;
	
	@Autowired
	ICasoRegistrado casoRepository;

	@Override
	public Mono<User> modificar(UserRequestDTO userDTO) {

		log.info("Holaaaa" + userDTO.getCASOREGISTRADO());
		
		CasoRegistrado casoRegistrado = new CasoRegistrado();
		
		casoRegistrado = casoRepository.findById(userDTO.getCASOREGISTRADO()).orElse(null);
		
		log.info("Adios" + casoRegistrado.getCASO());
		
		User user = new User();
		user.setCasoregistrado(casoRegistrado);
		user.setCELULAR(userDTO.getCELULAR());
		user.setLAST_NAME_1(userDTO.getLAST_NAME_1());
		user.setLAST_NAME_2(userDTO.getLAST_NAME_2());
		user.setMAIL(userDTO.getMAIL());
		user.setPASSWORD(userDTO.getPASSWORD());
		user.setSTATUS(userDTO.getSTATUS());
		user.setNAME(userDTO.getNAME());
		
		return Mono.justOrEmpty(userRepository.save(user));
	}

	@Override
	public Mono<List<User>> listar() {
		return Mono.justOrEmpty(userRepository.findAll());
	}

	@Override
	public Mono<User> listarPorId(Integer id) {
		return Mono.justOrEmpty(userRepository.findById(id));
	}

	@Override
	public Mono<User> registrar(UserRequestDTO userDTO) {
		
		CasoRegistrado casoRegistrado = new CasoRegistrado();
		
		casoRegistrado = casoRepository.findById(userDTO.getCASOREGISTRADO()).orElse(null);
		
		User user = new User();
		user.setID(userDTO.getID());
		user.setCasoregistrado(casoRegistrado);
		user.setCELULAR(userDTO.getCELULAR());
		user.setLAST_NAME_1(userDTO.getLAST_NAME_1());
		user.setLAST_NAME_2(userDTO.getLAST_NAME_2());
		user.setMAIL(userDTO.getMAIL());
		user.setPASSWORD(userDTO.getPASSWORD());
		user.setSTATUS(userDTO.getSTATUS());
		user.setNAME(userDTO.getNAME());
		
		return Mono.justOrEmpty(userRepository.save(user));
	}


}
