package com.sornambigai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sornambigai.dto.UsersDto;

public interface UsersRepository extends JpaRepository<UsersDto, String>{
	@Query(value="select * from users where email_id = ?1 ",nativeQuery=true)
	public UsersDto get(String userName);
	
}
