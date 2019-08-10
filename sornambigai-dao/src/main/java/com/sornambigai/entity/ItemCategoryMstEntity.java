package com.sornambigai.entity;

import javax.persistence.Entity;

import com.sornambigai.dto.ItemCategoryMstDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ItemCategoryMstEntity {

	private int itemCategoryMstId;

	private String itemCategoryId;

	private String goldCategoryId;

	private String goldCategoryName;

	private String itemCategoryName;

	public static ItemCategoryMstEntity formEntity(ItemCategoryMstDto dto) {
		ItemCategoryMstEntity entity = new ItemCategoryMstEntity();
		entity.setItemCategoryMstId(dto.getItemCategoryMstId());
		entity.setItemCategoryId(dto.getItemCategoryId());
		entity.setGoldCategoryId(dto.getGoldCategoryId());
		entity.setGoldCategoryName(dto.getGoldCategoryName());
		entity.setItemCategoryName(dto.getItemCategoryName());
		return entity;
	}
}
