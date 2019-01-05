package com.sornambigai.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "users")
@NoArgsConstructor
public class UsersDto {

	@Id
	@Column(name = "email_id")
	private String emailId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "password")
	private String password;

}