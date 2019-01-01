package com.sornambigai.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;

import com.sornambigai.dto.PriceMstDto;

import lombok.Data;

@Data
@Entity
public class PriceMstEntity {

	private int itemCategoryMstId;

	private String itemCategoryId;

	private String goldCategoryId;

	private BigDecimal pricePerGram;

	private BigDecimal pricePerSoverign;

	public static PriceMstEntity formEntity(PriceMstDto dto) {
		PriceMstEntity entity = new PriceMstEntity();
		entity.setItemCategoryMstId(dto.getItemCategoryMstId());
		entity.setItemCategoryId(dto.getItemCategoryId());
		entity.setGoldCategoryId(dto.getGoldCategoryId());
		entity.setPricePerGram(dto.getPricePerGram());
		entity.setPricePerSoverign(dto.getPricePerSoverign());
		return entity;
	}
}
