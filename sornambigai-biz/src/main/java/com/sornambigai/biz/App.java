package com.sornambigai.biz;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*
 * Sornambigai Main App
 */
@EnableJpaRepositories(basePackages = "com.sornambigai.repositories")
@EntityScan(basePackages = { "com.sornambigai.dto" })
@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Sornambigai Jwellers",
				version = "1.0.0",
				description = "Service for Enabling Jwellery Management"
		)
)
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
