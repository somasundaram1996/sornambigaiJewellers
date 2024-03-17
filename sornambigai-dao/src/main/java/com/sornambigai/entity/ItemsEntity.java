package com.sornambigai.entity;


import com.sornambigai.dto.ItemsDto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ItemsEntity {

	private long itemId;
	
	private String itemCode;

	private String itemCategoryId;

	private String itemName;

	public static ItemsEntity formEntity(ItemsDto itemsDto) {
		ItemsEntity entity = new ItemsEntity();
		entity.setItemId(itemsDto.getItemId());
		entity.setItemCode(itemsDto.getItemCode());
		entity.setItemCategoryId(itemsDto.getItemCategoryId());
		entity.setItemName(itemsDto.getItemName());
		return entity;
	}
	
	public static ItemsDto formDto(ItemsEntity itemsEntity) {
		ItemsDto itemsDto = new ItemsDto();
		itemsDto.setItemCode(itemsEntity.getItemCode());
		itemsDto.setItemCategoryId(itemsEntity.getItemCategoryId());
		itemsDto.setItemName(itemsEntity.getItemName());
		return itemsDto;
	}
}
