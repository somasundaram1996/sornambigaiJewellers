package com.sornambigai.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sornambigai.biz.billgeneration.service.usercheck.UserCheckService;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App 
{ 
	@Autowired
	private UserCheckService userCheckService;
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    @RequestMapping(value = "/hello")
    public String hello() {
    	return userCheckService.check();
    	
    }
}
