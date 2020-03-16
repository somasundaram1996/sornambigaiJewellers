package com.sornambigai.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@Entity
@Table(name = "item_category_mst")
@NoArgsConstructor
public class ItemCategoryMstDto {

	@Id
	@Column(name = "item_category_mst_id")
	@GeneratedValue
	private int itemCategoryMstId;

	@Column(name = "item_category_id")
	@NonNull
	private String itemCategoryId;

	@Column(name = "item_category_name")
	private String itemCategoryName;	

}
