package com.sornambigai.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "item_subtype_details")
public class ItemSubtypeDetailsDto {

	@Id
	@Column(name = "item_subtype_id")
	private String itemSubtypeId;

	@Column(name = "item_subtype_name")
	private String itemSubtypeName;

	@Column(name = "wastage_percentage")
	private String wastagePercentage;

	@Column(name = "making_percentage")
	private String makingPercentage;

}
