package com.sornambigai.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sornambigai.dto.UsersDto;
import com.sornambigai.entity.UserEntity;
import com.sornambigai.repositories.UsersRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserDaoImpl implements UserDao {

	private final UsersRepository usersRepository;

	@Override
	public UserEntity getUserById(String email) {
		Optional<UsersDto> user = usersRepository.findById(email);
		if(user.isPresent()) {
			return UserEntity.formEntity(user.get());
		} else {
			return null;
		}
	}

	@Override
	public void save(UserEntity user) {
		UsersDto dto = new UsersDto();
		dto.setEmailId(user.getEmailId());
		dto.setPassword(user.getPassword());
		dto.setUserName(user.getUserName());
		usersRepository.save(dto);
	}

}
