package com.rgb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgb.model.entity.Evento;



public interface EventoRepository 
	extends JpaRepository<Evento,Integer>{
}
