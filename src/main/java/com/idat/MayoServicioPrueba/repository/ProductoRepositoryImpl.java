package com.idat.MayoServicioPrueba.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.MayoServicioPrueba.model.Productos;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository {

	public List<Productos> listar = new ArrayList<Productos>();
	
	@Override
	public void guardarProducto(Productos producto) {
		// TODO Auto-generated method stub
		listar.add(producto);
	}

	@Override
	public void actualizarProducto(Productos producto) {
		// TODO Auto-generated method stub
		Productos p = obtenerProductoId(producto.getIdProducto());
		listar.remove(p);
		listar.add(producto); // ST

	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		Productos p = obtenerProductoId(id);
		listar.remove(id); // ST

	}

	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return listar;
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
		// Manera clásica, 
//		if(listar != null) { // Garantizo que no sea vacio
//			for (Productos productos : listar) {
//				if(productos.getIdProducto().equals(id)) 
//					return productos;
//			}
//		}
//		return null;
		// Manera factible con flujos
		// stream convertir en flujo
		// filter: operar como si fuera un foreach(for)
		
		//----------------------------------------------------------
		// FLUJO SOLO EN JAVA 8 PARA ARRIBA y LAMBDA! SOLO LISTAS. OBJETOS NO.
		return listar.stream().filter(p -> p.getIdProducto()==id).findFirst().orElse(null);
		// Optional: Vas a asegurar que va devolver algo
		// 			garantiza que devuelva un resultado
		// orElse: En lugar del Optional si es null no devuelve nada
	}

}