package com.sornambigai.biz.billgeneration.service.items;

import java.util.List;
import java.util.Map;

import com.sornambigai.entity.ItemCategoryMstEntity;
import com.sornambigai.entity.ItemsEntity;

public interface ItemsService {
	public List<ItemsEntity> getFilteredItems(String itemCategoryId);

	public List<ItemCategoryMstEntity> getItemCategories();

	public ItemsEntity addItem(Map<String, String> requestMap);

	public boolean deleteItem(String itemId);
}
