package com.sornambigai.biz.billgeneration.service.items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sornambigai.dao.ItemSubtypeDetailsDao;
import com.sornambigai.dao.ItemsDao;
import com.sornambigai.entity.ItemSubtypeDetailsEntity;
import com.sornambigai.entity.ItemsEntity;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor(onConstructor=@__(@Autowired))
public class ItemsServiceImpl implements ItemsService{
	
	private final ItemsDao itemsDao;
	
	private final ItemSubtypeDetailsDao itemSubtypeDetailsDao;
	
	@Override
	public List<ItemsEntity> getAllItems(){
		return itemsDao.getAllItems();
	}

	@Override
	public List<ItemSubtypeDetailsEntity> getSubTypeDetails() {
		return itemSubtypeDetailsDao.getSubTypeDetails();
	}
}
