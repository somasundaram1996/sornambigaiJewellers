package com.sornambigai.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.Data;

@Entity
@Table(name="users")
@Data
public class UsersDto {

	@Id
	@Column(name="email_id")
	private String emailId;

	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;

	@Override
	public String toString() {
		return "Users [emailId=" + emailId + ", userName=" + userName + ", password=" + password + "]";
	} 
}