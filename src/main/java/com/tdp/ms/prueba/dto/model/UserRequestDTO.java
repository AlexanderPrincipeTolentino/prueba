package com.tdp.ms.prueba.dto.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.tdp.ms.prueba.model.dao.CasoRegistrado;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRequestDTO {
	
	private Integer ID;
	
	private Integer STATUS;
	
	private String NAME;
	
	private String LAST_NAME_1;
	
	private String LAST_NAME_2;
	
	private String MAIL;
	
	private String PASSWORD;
	
	private String CELULAR;
	
	private Integer CASOREGISTRADO;

	public UserRequestDTO(Integer sTATUS, String nAME, String lAST_NAME_1, String lAST_NAME_2, String mAIL,
			String pASSWORD, String cELULAR, Integer cASOREGISTRADO) {
		this.STATUS = sTATUS;
		this.NAME = nAME;
		this.LAST_NAME_1 = lAST_NAME_1;
		this.LAST_NAME_2 = lAST_NAME_2;
		this.MAIL = mAIL;
		this.PASSWORD = pASSWORD;
		this.CELULAR = cELULAR;
		this.CASOREGISTRADO = cASOREGISTRADO;
	}
	
	

}
