package com.idat.MayoServicioPrueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MayoServicioPrueba.model.Productos;
import com.idat.MayoServicioPrueba.service.ProductoServiceImpl;

@Controller
@RequestMapping("/producto/v1") // Ruta principal
public class ProductoController {

	// Métodos
	@Autowired
	private ProductoServiceImpl service;
	
	@RequestMapping("/listar")
	public @ResponseBody List<Productos> listar() {
		return service.listarProductos();
	}
}
