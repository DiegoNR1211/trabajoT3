package com.rgb.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="tb_producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo_producto")
	private Integer codigo;
	
	@Column(name="nombre",length = 50, nullable = false)
	private String  nombre;
	
	@Column(name = "cantidad")
	private Integer cantidad;
	
	@Column(name = "costo")
	private Integer costo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_categoria")
	private Categoria categoria;
	
	@ManyToMany
	@JoinTable(name = "producto_paquete", 
		joinColumns = @JoinColumn(columnDefinition = "codigo_producto"),
		inverseJoinColumns = @JoinColumn(columnDefinition = "codigo_paquete"))
	private List<Paquete> paquetes;
	
	@ManyToMany
	@JoinTable(name = "producto_cotizacion", 
		joinColumns = @JoinColumn(columnDefinition = "codigo_producto"),
		inverseJoinColumns = @JoinColumn(columnDefinition = "codigo_cotizacion"))
	private List<Cotizacion> cotizaciones;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getCosto() {
		return costo;
	}

	public void setCosto(Integer costo) {
		this.costo = costo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Paquete> getPaquetes() {
		return paquetes;
	}

	public void setPaquetes(List<Paquete> paquetes) {
		this.paquetes = paquetes;
	}

	public List<Cotizacion> getCotizaciones() {
		return cotizaciones;
	}

	public void setCotizaciones(List<Cotizacion> cotizaciones) {
		this.cotizaciones = cotizaciones;
	}

	
}
