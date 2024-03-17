package com.sornambigai.dto;

import jakarta.persistence.*;
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
