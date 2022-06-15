package com.idat.MayoServicioPrueba.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Proveedor")
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProveedor;
	private String proveedor;
	private String direccion;
	
	@OneToOne
	@JoinColumn(name = "id_producto", 
				nullable = false, 
				unique = true, //idProducto? en caso de error:)
				foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_producto) references Productos(idProducto))"))//No debe ser igual a idProducto, debe ser tal como esta puesto aqui?
	private Productos producto;
	
	public Integer getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

}
