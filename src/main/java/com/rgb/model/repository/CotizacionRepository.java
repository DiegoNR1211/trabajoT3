package com.rgb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgb.model.entity.Cotizacion;



public interface CotizacionRepository 
	extends JpaRepository<Cotizacion,Integer>{
}
