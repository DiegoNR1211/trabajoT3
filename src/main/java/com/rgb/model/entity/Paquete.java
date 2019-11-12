package com.rgb.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name ="tb_paquete")
public class Paquete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo_paquete")
	private Integer codigo;
	
	@Column(name="nombre",length = 50, nullable = false)
	private String  nombre;
	
	@Column(name = "cantidad")
	private Integer cantidad;
	
	@Column(name = "costo")
	private Integer costo;
	
	@ManyToMany(mappedBy = "paquetes")
	private List<Producto> productos;

}
