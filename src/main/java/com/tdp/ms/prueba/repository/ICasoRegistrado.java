package com.tdp.ms.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdp.ms.prueba.model.dao.CasoRegistrado;

@Repository
public interface ICasoRegistrado extends JpaRepository<CasoRegistrado, Integer>{

}
