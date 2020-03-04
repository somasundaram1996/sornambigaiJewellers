package com.sornambigai.biz.billgeneration.service.usercheck;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sornambigai.biz.billgeneration.service.usercheck.model.CustomUserDetails;
import com.sornambigai.dao.UserDao;
import com.sornambigai.entity.UserEntity;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEntity = userDao.getUserById(username);
		CustomUserDetails customUser = null;
		if (Objects.nonNull(userEntity)) {
			customUser = new CustomUserDetails();
			customUser.setUser(userEntity);
		} else {
			throw new UsernameNotFoundException("User Not Found");
		}
		return customUser;
	}

}
