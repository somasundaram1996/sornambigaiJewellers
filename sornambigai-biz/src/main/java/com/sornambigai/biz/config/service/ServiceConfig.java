package com.sornambigai.biz.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sornambigai.biz.billgeneration.service.usercheck.UserCheckService;
import com.sornambigai.biz.billgeneration.service.usercheck.UserCheckServiceImpl;
import com.sornambigai.repositories.UsersRepository;


@Configuration
public class ServiceConfig {
	@Bean
	@Autowired
	public UserCheckService userCheckService(UsersRepository usersRepository) {
		return new UserCheckServiceImpl();
	}
}
