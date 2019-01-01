package com.sornambigai.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.sornambigai.entity.ItemsEntity;
import com.sornambigai.repositories.ItemsRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ItemsDaoImpl implements ItemsDao {

	private final ItemsRepository itemsRepository;

	@Override
	public List<ItemsEntity> getAllItems() {
		return itemsRepository.findAll().stream().map(ItemsEntity::formEntity).collect(Collectors.toList());
	}

}
