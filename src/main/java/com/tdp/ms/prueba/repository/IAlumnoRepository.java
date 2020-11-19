package com.tdp.ms.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdp.ms.prueba.model.dao.Alumno;

@Repository
public interface IAlumnoRepository extends JpaRepository<Alumno, Integer>{

}
