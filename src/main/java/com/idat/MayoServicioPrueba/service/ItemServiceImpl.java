package com.idat.MayoServicioPrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicioPrueba.model.Item;
import com.idat.MayoServicioPrueba.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemRepository repository;
	
	@Override
	public void guardarItem(Item item) {
		repository.save(item);
		
	}

	@Override
	public void actualizarItem(Item item) {	
		repository.saveAndFlush(item);
	}

	@Override
	public void eliminarItem(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Item> listarItems() {
		return repository.findAll();
	}

	@Override
	public Item obtenerItemPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}

}
