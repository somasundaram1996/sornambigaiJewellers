package com.sornambigai.entity;

import java.util.Objects;

import javax.persistence.Entity;

import com.sornambigai.dto.UsersDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

	private String emailId;

	private String userName;

	private String password;

	public static UserEntity formEntity(UsersDto dto) {
		if (Objects.nonNull(dto)) {
			UserEntity userEntity = new UserEntity();
			userEntity.setEmailId(dto.getEmailId());
			userEntity.setUserName(dto.getUserName());
			userEntity.setPassword(dto.getPassword());
			return userEntity;
		} else {
			return null;
		}
	}

}
