package com.idat.MayoServicioPrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicioPrueba.model.Productos;
import com.idat.MayoServicioPrueba.repository.ProductoRepositoryImpl;

@Service
public class ProductoServiceImpl implements ProductoService {

	// Inyeccion de la capa Repository para tener acceso a sus metodos
	@Autowired
	private ProductoRepositoryImpl repository;
	
	@Override
	public void guardarProducto(Productos producto) {
		repository.guardarProducto(producto);

	}

	@Override
	public void actualizarProducto(Productos producto) {
		repository.actualizarProducto(producto);

	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.eliminarProducto(id);

	}

	@Override
	public List<Productos> listarProductos() {
		repository.listarProductos();
		return null;
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
		repository.obtenerProductoId(id);
		return null;
	}

}
