package com.sornambigai.dao;

import com.sornambigai.entity.UserEntity;

public interface UserDao {

	UserEntity getUserById(String email);
}
