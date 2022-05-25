package com.idat.MayoServicioPrueba.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.MayoServicioPrueba.model.Productos;


public interface IProductoRepository {

	// Simular que tenemos conexion a las consultas de la BD
	void guardarProducto(Productos producto);
	void actualizarProducto(Productos producto);
	void eliminarProducto(Integer id);
	List<Productos> listarProductos();
	Productos obtenerProductoId(Integer id);
	
}
