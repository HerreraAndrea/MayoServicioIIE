package com.idat.MayoServicioPrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicioPrueba.model.Productos;
import com.idat.MayoServicioPrueba.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	// Inyeccion de la capa Repository para tener acceso a sus metodos
	@Autowired
	private IProductoRepository repository;
	
	@Override
	public void guardarProducto(Productos producto) {
		repository.save(producto);

	}

	@Override
	public void actualizarProducto(Productos producto) {
		repository.saveAndFlush(producto);

	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public List<Productos> listarProductos() {
		return repository.findAll();
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
		return repository.findById(id).orElse(null);
	}
	//Metodos: save, getById, deleteById son elementos de JPA para la Bd.
}
