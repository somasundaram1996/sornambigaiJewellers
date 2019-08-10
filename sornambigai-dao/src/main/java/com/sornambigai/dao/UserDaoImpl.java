package com.sornambigai.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.sornambigai.entity.UserEntity;
import com.sornambigai.repositories.UsersRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserDaoImpl implements UserDao {

	private final UsersRepository usersRepository;

	@Override
	public UserEntity getUserById(String email) {
		return UserEntity.formEntity(usersRepository.findOne(email));
	}

}
