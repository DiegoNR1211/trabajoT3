package com.rgb.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@Column(name = "codigo_categoria")
	private String codigo;
	
	@Column(name = "nombre", length = 35, nullable = false)
	private String nombre;
	
	@Column(name = "descripcion", length = 100)
	private String deescripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_empresa")
	private Empresa empresa;
	
	@OneToMany(mappedBy = "categoria", fetch = FetchType.LAZY)
	private List<Producto> productos;
	



}
