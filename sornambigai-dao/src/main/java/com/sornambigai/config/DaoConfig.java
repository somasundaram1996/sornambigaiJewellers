package com.sornambigai.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sornambigai.dao.ItemSubtypeDetailsDao;
import com.sornambigai.dao.ItemSubtypeDetailsDaoImpl;
import com.sornambigai.dao.ItemsDao;
import com.sornambigai.dao.ItemsDaoImpl;
import com.sornambigai.dao.UserDao;
import com.sornambigai.dao.UserDaoImpl;
import com.sornambigai.repositories.ItemSubtypeDetailsRepository;
import com.sornambigai.repositories.ItemsRepository;
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
	public ItemSubtypeDetailsDao itemSubtypeDetailsDao(ItemSubtypeDetailsRepository itemSubtypeDetailsRepository) {
		return new ItemSubtypeDetailsDaoImpl(itemSubtypeDetailsRepository);
	}
}
