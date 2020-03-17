package com.sornambigai.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sornambigai.dto.ItemsDto;

public interface ItemsRepository extends JpaRepository<ItemsDto, Long> {

	@Query(value = "SELECT * FROM items WHERE item_category_id=?1", nativeQuery = true)
	public List<ItemsDto> getFilteredItems(String itemCategoryId);

}
