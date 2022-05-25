package com.idat.MayoServicioPrueba.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "bditem")
@Entity
public class Item {
	@Id
	@GeneratedValue // Autogenerado 
	private Integer idItem;
	//@Column(name = "NOMBRE") Si queremos cambiar el nombre de la column
	private String item;
	private Integer cantidad;
	private Integer total;
	
	public Item(Integer idItem, String item, Integer cantidad, Integer total) {
		super();
		this.idItem = idItem;
		this.item = item;
		this.cantidad = cantidad;
		this.total = total;
	}

	public Item() {
		super();
	}

	public Integer getIdItem() {
		return idItem;
	}

	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
	

}
