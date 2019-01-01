package com.sornambigai.entity;

import javax.persistence.Entity;

import com.sornambigai.dto.DealerMstDto;

import lombok.Data;

@Data
@Entity
public class DealerMstEntity {

	private String dealerId;

	private String dealerName;

	public static DealerMstEntity formEntity(DealerMstDto dto) {
		DealerMstEntity entity = new DealerMstEntity();
		entity.setDealerId(dto.getDealerId());
		entity.setDealerName(dto.getDealerName());
		return entity;
	}

}
