package com.sornambigai.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "price_mst")
@NoArgsConstructor
public class PriceMstDto {

	@Id
	@Column(name = "item_category_mst_id")
	private int itemCategoryMstId;

	@Column(name = "item_category_id")
	private String itemCategoryId;

	@Column(name = "gold_category_id")
	private String goldCategoryId;

	@Column(name = "price_per_gram")
	private BigDecimal pricePerGram;

	@Column(name = "price_per_soverign")
	private BigDecimal pricePerSoverign;

}
