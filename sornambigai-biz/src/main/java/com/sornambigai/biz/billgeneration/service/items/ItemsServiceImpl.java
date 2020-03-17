package com.sornambigai.biz.billgeneration.service.items;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.sornambigai.dao.ItemCategoryMstDao;
import com.sornambigai.dao.ItemsDao;
import com.sornambigai.entity.ItemCategoryMstEntity;
import com.sornambigai.entity.ItemsEntity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ItemsServiceImpl implements ItemsService {

	private final ItemsDao itemsDao;

	private final ItemCategoryMstDao itemCategoryMstDao;

	@Override
	public List<ItemsEntity> getFilteredItems(Map<String, Object> requestMap) {
		return itemsDao.getFilteredItems(requestMap.get("itemCategoryId").toString());
	}

	@Override
	public List<ItemCategoryMstEntity> getItemCategories() {
		return itemCategoryMstDao.getItemCategories();
	}

	@Override
	public boolean addItem(Map<String, String> requestMap) {
		ItemsEntity item = new ItemsEntity();
		item.setItemCategoryId(requestMap.get("itemCategoryId"));
		String itemCode = requestMap.get("itemName").substring(0, 3);
		item.setItemCode(itemCode);
		item.setItemName(requestMap.get("itemName"));
		itemsDao.addItem(item);
		return true;
	}

	@Override
	public boolean deleteItem(Map<String, String> requestMap) {
		return itemsDao.deleteItem(requestMap.get("itemId"));
	}
}
