package com.sornambigai.entity;

import java.math.BigDecimal;


import com.sornambigai.dto.PriceMstDto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PriceMstEntity {

	private int itemCategoryMstId;

	private String itemCategoryId;

	private BigDecimal pricePerGram;


	public static PriceMstEntity formEntity(PriceMstDto dto) {
		PriceMstEntity entity = new PriceMstEntity();
		entity.setItemCategoryMstId(dto.getItemCategoryMstId());
		entity.setItemCategoryId(dto.getItemCategoryId());
		entity.setPricePerGram(dto.getPricePerGram());
		return entity;
	}
	
	public static PriceMstDto formDto(PriceMstEntity priceMstEntity) {
		PriceMstDto priceMstDyo = new PriceMstDto();
		priceMstDyo.setItemCategoryMstId(priceMstEntity.getItemCategoryMstId());
		priceMstDyo.setItemCategoryId(priceMstEntity.getItemCategoryId());
		priceMstDyo.setPricePerGram(priceMstEntity.getPricePerGram());
		return priceMstDyo;
	}
}
