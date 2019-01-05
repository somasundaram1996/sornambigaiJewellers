package com.sornambigai.biz.billgeneration.service.items;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.sornambigai.dao.DealerMstDao;
import com.sornambigai.dao.ItemCategoryMstDao;
import com.sornambigai.dao.ItemSubtypeDetailsDao;
import com.sornambigai.dao.ItemsDao;
import com.sornambigai.entity.DealerMstEntity;
import com.sornambigai.entity.ItemCategoryMstEntity;
import com.sornambigai.entity.ItemSubtypeDetailsEntity;
import com.sornambigai.entity.ItemsEntity;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor(onConstructor=@__(@Autowired))
public class ItemsServiceImpl implements ItemsService{
	
	private final ItemsDao itemsDao;
	
	private final ItemSubtypeDetailsDao itemSubtypeDetailsDao;
	
	private final DealerMstDao dealerMstDao;
	
	private final ItemCategoryMstDao itemCategoryMstDao;
	
	@Override
	public List<ItemsEntity> getFilteredItems(Map<String,Object>requestMap){
		return itemsDao.getFilteredItems(requestMap.get("itemCategoryId").toString(),requestMap.get("dealerId").toString(),requestMap.get("goldCategoryId").toString());
	}

	@Override
	public List<ItemSubtypeDetailsEntity> getSubTypeDetails() {
		return itemSubtypeDetailsDao.getSubTypeDetails();
	}

	@Override
	public List<DealerMstEntity> getDealerDetails() {
		return dealerMstDao.getDealerDetails();
	}

	@Override
	public List<ItemCategoryMstEntity> getItemCategories() {
		return itemCategoryMstDao.getItemCategories();
	}
}
