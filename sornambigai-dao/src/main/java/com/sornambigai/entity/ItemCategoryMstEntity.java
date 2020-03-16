package com.sornambigai.entity;

import javax.persistence.Column;
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

	private String itemCategoryName;

	public static ItemCategoryMstEntity formEntity(ItemCategoryMstDto dto) {
		ItemCategoryMstEntity entity = new ItemCategoryMstEntity();
		entity.setItemCategoryMstId(dto.getItemCategoryMstId());
		entity.setItemCategoryId(dto.getItemCategoryId());
		entity.setItemCategoryName(dto.getItemCategoryName());
		return entity;
	}
	
	public static ItemCategoryMstDto formDto(ItemCategoryMstEntity entity) {
		ItemCategoryMstDto dto = new ItemCategoryMstDto();
		dto.setItemCategoryMstId(dto.getItemCategoryMstId());
		dto.setItemCategoryId(entity.getItemCategoryId());
		dto.setItemCategoryName(entity.getItemCategoryName());
		return dto;
	}
}
