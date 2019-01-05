package com.sornambigai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sornambigai.dto.PriceMstDto;

public interface PriceMstRepository extends JpaRepository<PriceMstDto, Integer> {

}
