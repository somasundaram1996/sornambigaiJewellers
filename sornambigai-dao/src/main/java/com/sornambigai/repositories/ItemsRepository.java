package com.sornambigai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sornambigai.dto.ItemsDto;

public interface ItemsRepository extends JpaRepository<ItemsDto, String> {

}
