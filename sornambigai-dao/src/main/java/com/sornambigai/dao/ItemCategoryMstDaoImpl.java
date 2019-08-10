package com.sornambigai.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.sornambigai.entity.ItemCategoryMstEntity;
import com.sornambigai.repositories.ItemCategoryMstRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ItemCategoryMstDaoImpl implements ItemCategoryMstDao {

	private final ItemCategoryMstRepository itemCategoryMstRepository;

	@Override
	public List<ItemCategoryMstEntity> getItemCategories() {
		return itemCategoryMstRepository.findAll().stream().map(dto -> ItemCategoryMstEntity.formEntity(dto))
				.collect(Collectors.toList());
	}

}
