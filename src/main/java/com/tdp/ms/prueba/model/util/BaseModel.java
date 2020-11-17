package com.tdp.ms.prueba.model.util;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BaseModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private boolean status;
    @Column(name = "created_by")
    private int createdBy;
    @Column(name = "updated_by")
    private int updatedBy;
    
    @JsonIgnore
	@Column(name="created_at",nullable = false)
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	
	@Column(name="updated_at",nullable = false)
	@UpdateTimestamp
	private LocalDateTime updatedAt;

}
