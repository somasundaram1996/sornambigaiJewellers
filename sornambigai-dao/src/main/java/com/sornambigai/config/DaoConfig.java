package com.sornambigai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sornambigai.dao.UserDao;
import com.sornambigai.dao.UserDaoImpl;

@Configuration
public class DaoConfig {
	
	@Bean
	public UserDao userDao() {
		return new UserDaoImpl();
	}
}
