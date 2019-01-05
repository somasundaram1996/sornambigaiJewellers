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
	public List<ItemsEntity> getFilteredItems(String itemCategoryId, String dealerId, String goldCategoryId) {
		return itemsRepository.getFilteredItems(itemCategoryId, dealerId, goldCategoryId).stream()
				.map(itemsDto -> ItemsEntity.formEntity(itemsDto)).collect(Collectors.toList());
	}

}
