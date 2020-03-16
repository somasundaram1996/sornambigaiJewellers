package com.sornambigai.biz.billgeneration.service.usercheck;

import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.sornambigai.dao.UserDao;
import com.sornambigai.entity.UserEntity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserCheckServiceImpl implements UserCheckService {

	private final UserDao userDao;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public boolean check(Map<String, Object> requestMap) {
		UserEntity user = userDao.getUserById(requestMap.get("email-id").toString());
		return Objects.nonNull(user) && user.getPassword().equals(requestMap.get("password").toString());
	}

	@Override
	public boolean addUser(Map<String, Object> requestMap) {
		UserEntity user = new UserEntity();
		user.setEmailId(String.valueOf(requestMap.get("emailId")));
		String password = String.valueOf(requestMap.get("password"));
		user.setPassword(passwordEncoder.encode(password));
		user.setUserName(String.valueOf(requestMap.get("userName")));
		UserEntity existingUser = userDao.getUserById(user.getEmailId());
		if (Objects.nonNull(existingUser)) {
			return false;
		}
		userDao.save(user);
		return true;
	}

}
