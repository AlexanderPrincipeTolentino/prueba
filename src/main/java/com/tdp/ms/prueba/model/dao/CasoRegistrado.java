package com.tdp.ms.prueba.model.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@Table(name = "DHR_CASO_REGISTRADO")
public class CasoRegistrado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	
	@Column(name = "TIPO_RED")
	private String TIPO_RED;
	
	@Column(name = "TIPO_CONSULTA")
	private String TIPO_CONSULTA;
	
	@Column(name = "CASO")
	private String CASO;
	
	@Column(name = "NOMBRE_BENEFICIADO")
	private String NOMBRE_BENEFICIADO;
	
	@Column(name = "DNI")
	private String DNI;
	
	@Column(name = "TLF_CONTACTO")
	private String TLF_CONTACTO;
	
	@Column(name = "TLF_CONSULTA")
	private String TLF_CONSULTA;
	
	@Column(name = "DESCRIPCION")
	private String DESCRIPCION;
	

}
