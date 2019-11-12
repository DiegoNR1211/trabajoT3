package com.rgb.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgb.model.entity.Categoria;



public interface CategoriaRepository 
	extends JpaRepository<Categoria,String>{
}
