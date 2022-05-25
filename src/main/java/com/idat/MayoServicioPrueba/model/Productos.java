package com.idat.MayoServicioPrueba.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/* Indicar que es un modelo de base de datos
 Como hacer eso? Con la anotacion @Table(name = "nombreBD")
*/
@Table(name = "bdproductos")
@Entity // Para indicar que es un modelo ENTIDAD - RELACION
public class Productos {
	
	@Id
	@GeneratedValue // Autogenerado 
	private Integer idProducto;
	//@Column(name = "NOMBRE") Si queremos cambiar el nombre de la column
	private String nombreProducto;
	private String descripcion;
	private Double precio;
	private Integer stock;
	
	public Productos() {
		super();
	}
	public Productos(Integer idProducto, String nombreProducto, String descripcion, Double precio, Integer stock) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
}
