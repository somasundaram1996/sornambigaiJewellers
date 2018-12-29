package com.sornambigai.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
@EnableJpaRepositories(basePackages="com.sornambigai.repositories")
@EntityScan(basePackages = {"com.sornambigai.dto"})
@SpringBootApplication
public class App 
{ 
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
}
