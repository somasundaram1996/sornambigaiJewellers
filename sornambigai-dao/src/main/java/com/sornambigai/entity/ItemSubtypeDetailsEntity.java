package com.sornambigai.entity;

import javax.persistence.Entity;

import com.sornambigai.dto.ItemSubtypeDetailsDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ItemSubtypeDetailsEntity {
	private String itemSubtypeId;

	private String itemSubtypeName;

	private String wastagePercentage;

	private String makingPercentage;

	public static ItemSubtypeDetailsEntity formEntity(ItemSubtypeDetailsDto dto) {
		ItemSubtypeDetailsEntity entity = new ItemSubtypeDetailsEntity();
		entity.setItemSubtypeId(dto.getItemSubtypeId());
		entity.setItemSubtypeName(dto.getItemSubtypeName());
		entity.setWastagePercentage(dto.getWastagePercentage());
		entity.setMakingPercentage(dto.getMakingPercentage());
		return entity;
	}

}
