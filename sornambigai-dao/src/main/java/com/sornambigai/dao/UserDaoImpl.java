package com.sornambigai.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.sornambigai.entity.UserEntity;
import com.sornambigai.repositories.UsersRepository;

public class UserDaoImpl implements UserDao {

	@Autowired
	private UsersRepository usersRepository;

	public UserEntity getUserById(String email) {
		return UserEntity.formEntity(usersRepository.findOne(email));
	}

}
