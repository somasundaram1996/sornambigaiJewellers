package com.sornambigai.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name = "item_category_mst")
public class ItemCategoryMstDto {

	@Id
	@Column(name = "item_category_mst_id")
	@NonNull
	private int itemCategoryMstId;

	@Column(name = "item_category_id")
	@NonNull
	private String itemCategoryId;

	@Column(name = "gold_category_id")
	@NonNull
	private String goldCategoryId;

	@Column(name = "gold_category_name")
	private String goldCategoryName;

	@Column(name = "item_category_name")
	private String itemCategoryName;
}
