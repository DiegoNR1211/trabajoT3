package com.rgb.model.entity;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tb_empresa")
public class Empresa {
	
	@Id
	@Column(name = "codigo_empresa")
	private String codigo;
	
	@Column(name = "nombre", length = 50)
	private String nombre;
	
	@Column(name = "descripcion", length = 500)
	private String descripcion;
	
	@Column(name = "direccion", length = 100)
	private String direccion;
	
	@Column(name = "correo", length = 50)
	private String correo;
	
	@Column(name = "telefono")
	private Integer telefono;
	
	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
	private List<Servicio> servicios;
	
	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
	private List<Evento> eventos;
	
	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
	private List<Categoria> categorias;

}
