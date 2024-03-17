package com.sornambigai.dao;

import java.util.List;

import com.sornambigai.entity.ItemsEntity;

public interface ItemsDao {

	public List<ItemsEntity> getFilteredItems(String itemCategoryId);

	public long addItem(ItemsEntity item);

	public boolean deleteItem(String itemId);
	
}
