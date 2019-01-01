package com.sornambigai.biz.billgeneration.service.items;

import java.util.List;

import com.sornambigai.entity.ItemSubtypeDetailsEntity;
import com.sornambigai.entity.ItemsEntity;

public interface ItemsService {
	public List<ItemsEntity> getAllItems();

	public List<ItemSubtypeDetailsEntity> getSubTypeDetails();
}
