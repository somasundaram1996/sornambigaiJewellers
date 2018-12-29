package com.sornambigai.biz.billgeneration.service.usercheck;

import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.sornambigai.dto.UsersDto;
import com.sornambigai.repositories.UsersRepository;
public class UserCheckServiceImpl implements UserCheckService{
	@Autowired
	UsersRepository usersRepository;
	
	@Override
	public UsersDto check(Map<String,Object>requestMap) {
		 UsersDto user =  usersRepository.findOne(requestMap.get("email-id").toString());
		 if(Objects.nonNull(user)&&user.getPassword().equals(requestMap.get("password").toString())) {
			 return user;
		 } else {
			 return null;
		 }
	}

}
