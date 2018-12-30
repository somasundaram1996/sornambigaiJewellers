package com.sornambigai.biz.billgeneration.service.usercheck;

import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.sornambigai.dao.UserDao;
import com.sornambigai.entity.UserEntity;
public class UserCheckServiceImpl implements UserCheckService{
	@Autowired
	private UserDao userDao;

	@Override
	public boolean check(Map<String,Object>requestMap) {
		UserEntity user = userDao.getUserById(requestMap.get("email-id").toString());
		return Objects.nonNull(user)&&user.getPassword().equals(requestMap.get("password").toString());
	}

}
