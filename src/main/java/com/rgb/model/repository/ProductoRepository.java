package com.rgb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgb.model.entity.Producto;



public interface ProductoRepository 
	extends JpaRepository<Producto,Integer>{
}
