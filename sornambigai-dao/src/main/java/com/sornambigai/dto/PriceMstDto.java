package com.sornambigai.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
	@Column(name = "item_category_id")
	private String itemCategoryId;

	@Column(name = "price_per_gram")
	private BigDecimal pricePerGram;

}
