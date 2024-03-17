package com.sornambigai.dao;

import java.util.List;
import java.util.stream.Collectors;

import com.sornambigai.dto.ItemsDto;
import org.springframework.beans.factory.annotation.Autowired;

import com.sornambigai.entity.ItemsEntity;
import com.sornambigai.repositories.ItemsRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ItemsDaoImpl implements ItemsDao {

	private final ItemsRepository itemsRepository;

	@Override
	public List<ItemsEntity> getFilteredItems(String itemCategoryId) {
		return itemsRepository.getFilteredItems(itemCategoryId).stream()
				.map(itemsDto -> ItemsEntity.formEntity(itemsDto)).collect(Collectors.toList());
	}

	@Override
	public long addItem(ItemsEntity item) {
		ItemsDto save = itemsRepository.save(ItemsEntity.formDto(item));
		return save.getItemId();
	}

	@Override
	public boolean deleteItem(String itemId) {
		try {
			long itemToBeDeleted = Long.parseLong(itemId);
			itemsRepository.deleteById(itemToBeDeleted);
			return true;
		}catch(Exception e) {
			return false;
		}
	}


}
