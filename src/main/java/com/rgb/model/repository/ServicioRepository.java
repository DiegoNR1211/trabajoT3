package com.rgb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgb.model.entity.Servicio;



public interface ServicioRepository 
	extends JpaRepository<Servicio,String>{
}
