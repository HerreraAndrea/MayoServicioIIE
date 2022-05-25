package com.idat.MayoServicioPrueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MayoServicioPrueba.model.Productos;

@Repository
public interface IProductoRepository extends JpaRepository<Productos, Integer> {
	
	// CrudRepository = si se desea solo crear un CRUD
	// PaginandShorty = si se desea solo hacer paginacion
	// Jpa= si se desea hacer mas cosas <Clase, identificadorTIPO>

	
}
