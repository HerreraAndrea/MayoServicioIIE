package com.idat.MayoServicioPrueba.service;

import java.util.List;

import com.idat.MayoServicioPrueba.model.Productos;

public interface ProductoService {

	// Simular que tenemos conexion a las consultas de la BD
		void guardarProducto(Productos producto);
		void actualizarProducto(Productos producto);
		void eliminarProducto(Integer id);
		List<Productos> listarProductos();
		Productos obtenerProductoId(Integer id);
}
