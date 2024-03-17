package com.sornambigai.dto;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "price_mst")
@NoArgsConstructor
public class PriceMstDto {

	@Id
	@Column(name = "item_category_mst_id")
	@GeneratedValue
	private int itemCategoryMstId;

	@Column(name = "item_category_id")
	private String itemCategoryId;

	@Column(name = "price_per_gram")
	private BigDecimal pricePerGram;

}
