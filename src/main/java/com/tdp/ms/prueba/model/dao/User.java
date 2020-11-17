package com.tdp.ms.prueba.model.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@Table(name = "DHR_USER")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	
	@Column(name = "STATUS")
	private Integer STATUS;
	
	@Column(name = "NAME")
	private String NAME;
	
	@Column(name = "LAST_NAME_1")
	private String LAST_NAME_1;
	
	@Column(name = "LAST_NAME_2")
	private String LAST_NAME_2;
	
	@Column(name = "MAIL")
	private String MAIL;
	
	@Column(name = "PASSWORD")
	private String PASSWORD;
	
	@Column(name = "CELULAR")
	private String CELULAR;
	
	@ManyToOne
	@JoinColumn(name = "ID_CASO_REGISTRADO")
	CasoRegistrado casoregistrado;
	
	
	
}
