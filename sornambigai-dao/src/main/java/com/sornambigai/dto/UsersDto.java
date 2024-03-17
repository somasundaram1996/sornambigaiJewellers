package com.sornambigai.dto;

import jakarta.persistence.*;

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