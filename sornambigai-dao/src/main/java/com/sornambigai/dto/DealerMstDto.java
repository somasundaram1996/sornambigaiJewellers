package com.sornambigai.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name = "dealer_mst")
public class DealerMstDto {

	@Id
	@Column(name = "dealer_id")
	@NonNull
	private String dealerId;

	@Column(name = "dealer_name")
	@NonNull
	private String dealerName;
}
