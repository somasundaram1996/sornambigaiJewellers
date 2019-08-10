package com.sornambigai.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.sornambigai.entity.DealerMstEntity;
import com.sornambigai.repositories.DealerMstRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DealerMstDaoImpl implements DealerMstDao {

	private final DealerMstRepository dealerMstRepository;

	@Override
	public List<DealerMstEntity> getDealerDetails() {
		return dealerMstRepository.findAll().stream().map(dto -> DealerMstEntity.formEntity(dto))
				.collect(Collectors.toList());
	}

}
