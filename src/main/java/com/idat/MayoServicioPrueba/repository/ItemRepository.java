package com.idat.MayoServicioPrueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.MayoServicioPrueba.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
