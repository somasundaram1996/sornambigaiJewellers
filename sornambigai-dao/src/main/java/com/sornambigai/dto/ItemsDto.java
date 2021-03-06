package com.sornambigai.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "items")
@NoArgsConstructor
public class ItemsDto {
	@Id
	@Column(name="item_id")
	@GeneratedValue
	private long itemId;
	
	@Column(name = "item_code")
	private String itemCode;

	@Column(name = "item_category_id")
	private String itemCategoryId;

	@Column(name = "item_name")
	private String itemName;
	
	
}
