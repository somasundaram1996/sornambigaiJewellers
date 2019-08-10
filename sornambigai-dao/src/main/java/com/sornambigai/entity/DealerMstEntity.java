package com.sornambigai.entity;

import javax.persistence.Entity;

import com.sornambigai.dto.DealerMstDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
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
