package com.sornambigai.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "items")
public class ItemsDto {

	@Id
	@Column(name = "item_code")
	private String itemCode;

	@Column(name = "item_category_id")
	private String itemCategoryId;

	@Column(name = "gold_category_id")
	private String goldCategoryId;

	@Column(name = "item_subtype_id")
	private String itemsubtypeId;

	@Column(name = "dealer_id")
	private String dealerId;

	@Column(name = "item_type")
	private String itemType;

	@Column(name = "item_name")
	private String itemName;

	@Column(name = "item")
	private String item;
}
