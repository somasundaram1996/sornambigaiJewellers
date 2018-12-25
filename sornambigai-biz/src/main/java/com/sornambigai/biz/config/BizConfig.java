package com.sornambigai.biz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.sornambigai.biz.config.service.ServiceConfig;
import com.sornambigai.config.DaoConfig;

@Configuration
@Import({
	DaoConfig.class,
	ServiceConfig.class
})
public class BizConfig {

}
