package com.sornambigai.repositories;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.sornambigai.dto.PriceMstDto;

public interface PriceMstRepository extends JpaRepository<PriceMstDto, String> {
	@Modifying
	@Transactional
	@Query(value = "Update price_mst SET price_per_gram = ?1 where item_category_id = ?2", nativeQuery = true)
	public void updatePrice(float pricePerGram,String itemCategoryId);
}
