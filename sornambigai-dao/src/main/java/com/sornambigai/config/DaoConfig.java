package com.sornambigai.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sornambigai.dao.ItemCategoryMstDao;
import com.sornambigai.dao.ItemCategoryMstDaoImpl;
import com.sornambigai.dao.ItemsDao;
import com.sornambigai.dao.ItemsDaoImpl;
import com.sornambigai.dao.PriceMstDao;
import com.sornambigai.dao.PriceMstDaoImpl;
import com.sornambigai.dao.UserDao;
import com.sornambigai.dao.UserDaoImpl;
import com.sornambigai.repositories.ItemCategoryMstRepository;
import com.sornambigai.repositories.ItemsRepository;
import com.sornambigai.repositories.PriceMstRepository;
import com.sornambigai.repositories.UsersRepository;

@Configuration
public class DaoConfig {

	@Bean
	@Autowired
	public UserDao userDao(UsersRepository usersRepository) {
		return new UserDaoImpl(usersRepository);
	}

	@Bean
	@Autowired
	public ItemsDao itemsDao(ItemsRepository itemsRepository) {
		return new ItemsDaoImpl(itemsRepository);
	}


	@Bean
	@Autowired
	public ItemCategoryMstDao iItemCategoryMstDao(ItemCategoryMstRepository itemCategoryMstRepository) {
		return new ItemCategoryMstDaoImpl(itemCategoryMstRepository);
	}
	
	@Bean
	@Autowired
	public PriceMstDao priceMstDao(PriceMstRepository priceMstRepository) {
		return new PriceMstDaoImpl(priceMstRepository); 
	}
}
