package com.sornambigai.dao;

import java.util.List;

import com.sornambigai.entity.ItemCategoryMstEntity;

public interface ItemCategoryMstDao {

	List<ItemCategoryMstEntity> getItemCategories();
	
	public void addItemCategory(ItemCategoryMstEntity items);

}
