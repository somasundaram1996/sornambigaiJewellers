package com.sornambigai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sornambigai.dto.ItemCategoryMstDto;

public interface ItemCategoryMstRepository extends JpaRepository<ItemCategoryMstDto, Integer> {

}
