package com.idat.MayoServicioPrueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MayoServicioPrueba.model.Item;
import com.idat.MayoServicioPrueba.service.ItemServiceImpl;

@Controller
@RequestMapping("/item/v1")
public class ItemController {

	@Autowired
	private ItemServiceImpl service;
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<Item>> listarItem() {
		return new ResponseEntity<List<Item>>(service.listarItems(), HttpStatus.OK);
	}
	
	// con path porque queremos insertar, update
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardarItem(@RequestBody Item items) {
		service.guardarItem(items);
		return new ResponseEntity<Void>(HttpStatus.CREATED); // Mensajes de respuesta en Consola
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminarItem(@PathVariable Integer id) {
		
		Item it = service.obtenerItemPorId(id);
		
		if(it != null) {
			service.eliminarItem(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	// Mensajes de respuesta
	}
	@RequestMapping(path = "/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizarItem(@RequestBody Item item) {
		
		Item it = service.obtenerItemPorId(item.getIdItem());
		
		if(it != null) {
			service.actualizarItem(item);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Item> obtenerItemPorId(@PathVariable Integer id) {
		Item it = service.obtenerItemPorId(id);
		
		if(it != null) {
			return new ResponseEntity<Item>(service.obtenerItemPorId(id), HttpStatus.OK);
		}
		
		return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
	}
}
