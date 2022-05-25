package com.idat.MayoServicioPrueba.service;

import java.util.List;

import com.idat.MayoServicioPrueba.model.Item;

public interface ItemService {

	void guardarItem(Item item);
	void actualizarItem(Item item);
	void eliminarItem(Integer id);
	List<Item> listarItems();
	Item obtenerItemPorId(Integer id);
}
