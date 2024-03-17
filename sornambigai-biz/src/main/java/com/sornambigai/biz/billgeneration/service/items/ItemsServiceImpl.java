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
	public List<ItemsEntity> getFilteredItems(String itemCategoryId) {
		return itemsDao.getFilteredItems(itemCategoryId);
	}

	@Override
	public List<ItemCategoryMstEntity> getItemCategories() {
		return itemCategoryMstDao.getItemCategories();
	}

	@Override
	public ItemsEntity addItem(Map<String, String> requestMap) {
		ItemsEntity item = new ItemsEntity();
		item.setItemCategoryId(requestMap.get("itemCategoryId"));
		String itemCode = requestMap.get("itemName").substring(0, 3);
		item.setItemCode(itemCode);
		item.setItemName(requestMap.get("itemName"));
		long itemId = itemsDao.addItem(item);
		item.setItemId(itemId);
		return item;
	}

	@Override
	public boolean deleteItem(String itemId) {
		return itemsDao.deleteItem(itemId);
	}
}
