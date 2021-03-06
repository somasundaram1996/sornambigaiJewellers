package com.sornambigai.biz.billgeneration.service.items;

import java.util.List;
import java.util.Map;

import com.sornambigai.entity.ItemCategoryMstEntity;
import com.sornambigai.entity.ItemsEntity;

public interface ItemsService {
	public List<ItemsEntity> getFilteredItems(Map<String, Object> requestMap);

	public List<ItemCategoryMstEntity> getItemCategories();

	public boolean addItem(Map<String, String> requestMap);

	public boolean deleteItem(Map<String, String> requestMap);
}
