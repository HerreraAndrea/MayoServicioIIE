package com.idat.MayoServicioPrueba.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

/* Indicar que es un modelo de base de datos
 Como hacer eso? Con la anotacion @Table(name = "nombreBD")
*/

@Entity // Para indicar que es un modelo ENTIDAD - RELACION
@Table(name = "Productos")
public class Productos {
	
	@Id
	@GeneratedValue // Autogenerado 
	private Integer idProducto;
	//@Column(name = "NOMBRE") Si queremos cambiar el nombre de la column
	private String nombreProducto;
	private String descripcion;
	private Double precio;
	private Integer stock;
	
	@OneToOne(mappedBy = "producto", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Proveedor proveedor;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	//Tercera tabla, "detalle"
	@JoinTable(
			name = "productos_clientes",
			joinColumns = @JoinColumn(
					name = "id_producto",
					nullable = false,
					unique = true,
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_producto) references Productos(id_producto)")
					),
			inverseJoinColumns = @JoinColumn(
					name = "id_cliente",
					nullable = false,
					unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_cliente) references Clientes (id_cliente)"))
			)
	private List<Cliente> cliente = new ArrayList<>(); // N:M
	
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
