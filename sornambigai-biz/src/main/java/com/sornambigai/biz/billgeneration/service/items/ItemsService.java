package com.sornambigai.biz.billgeneration.service.items;

import java.util.List;
import java.util.Map;

import com.sornambigai.entity.DealerMstEntity;
import com.sornambigai.entity.ItemCategoryMstEntity;
import com.sornambigai.entity.ItemSubtypeDetailsEntity;
import com.sornambigai.entity.ItemsEntity;

public interface ItemsService {
	public List<ItemsEntity> getFilteredItems(Map<String,Object>requestMap);

	public List<ItemSubtypeDetailsEntity> getSubTypeDetails();

	public List<DealerMstEntity> getDealerDetails();

	public List<ItemCategoryMstEntity> getItemCategories();
}
