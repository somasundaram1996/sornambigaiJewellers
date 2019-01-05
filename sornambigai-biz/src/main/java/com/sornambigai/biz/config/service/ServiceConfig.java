package com.sornambigai.biz.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sornambigai.biz.billgeneration.service.items.ItemsService;
import com.sornambigai.biz.billgeneration.service.items.ItemsServiceImpl;
import com.sornambigai.biz.billgeneration.service.usercheck.UserCheckService;
import com.sornambigai.biz.billgeneration.service.usercheck.UserCheckServiceImpl;
import com.sornambigai.dao.DealerMstDao;
import com.sornambigai.dao.ItemCategoryMstDao;
import com.sornambigai.dao.ItemSubtypeDetailsDao;
import com.sornambigai.dao.ItemsDao;
import com.sornambigai.dao.UserDao;


@Configuration
public class ServiceConfig {
	
	@Bean
	@Autowired
	public UserCheckService userCheckService(UserDao userDao) {
		return new UserCheckServiceImpl(userDao);
	}
	
	@Bean
	@Autowired
	public ItemsService itemsService(ItemsDao itemsDao,ItemSubtypeDetailsDao itemSubtypeDetailsDao,DealerMstDao dealerMstDao,ItemCategoryMstDao itemCategoryMstDao) {
		return new ItemsServiceImpl(itemsDao,itemSubtypeDetailsDao,dealerMstDao,itemCategoryMstDao);
	}
}
