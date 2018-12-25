package com.sornambigai.biz.config.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sornambigai.biz.billgeneration.service.usercheck.UserCheckService;
import com.sornambigai.biz.billgeneration.service.usercheck.UserCheckServiceImpl;


@Configuration
public class ServiceConfig {
	@Bean
	public UserCheckService userCheckService() {
		return new UserCheckServiceImpl();
	}
}
