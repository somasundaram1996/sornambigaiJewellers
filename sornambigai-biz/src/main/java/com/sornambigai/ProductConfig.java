package com.sornambigai;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.sornambigai.biz.config.BizConfig;

@Configuration
@Import({
	BizConfig.class
})
public class ProductConfig {

}
