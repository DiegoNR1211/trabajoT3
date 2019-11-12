package com.rgb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgb.model.entity.Paquete;



public interface PaqueteRepository 
	extends JpaRepository<Paquete,Integer>{
}
