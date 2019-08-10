package com.sornambigai.entity;

import javax.persistence.Entity;

import com.sornambigai.dto.ItemsDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ItemsEntity {

	private String itemCode;

	private String itemCategoryId;

	private String goldCategoryId;

	private String itemsubtypeId;

	private String dealerId;

	private String itemType;

	private String itemName;

	private String item;

	public static ItemsEntity formEntity(ItemsDto itemsDto) {
		ItemsEntity entity = new ItemsEntity();
		entity.setItemCode(itemsDto.getItemCode());
		entity.setGoldCategoryId(itemsDto.getGoldCategoryId());
		entity.setDealerId(itemsDto.getDealerId());
		entity.setItemCategoryId(itemsDto.getItemCategoryId());
		entity.setItemType(itemsDto.getItemType());
		entity.setItemsubtypeId(itemsDto.getItemsubtypeId());
		entity.setItemName(itemsDto.getItemName());
		entity.setItem(itemsDto.getItem());
		return entity;
	}
}
