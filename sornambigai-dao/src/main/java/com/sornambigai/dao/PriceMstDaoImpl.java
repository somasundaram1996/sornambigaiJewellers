package com.sornambigai.dao;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sornambigai.dto.PriceMstDto;
import com.sornambigai.entity.PriceMstEntity;
import com.sornambigai.repositories.PriceMstRepository;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PriceMstDaoImpl implements PriceMstDao {
	
	private final PriceMstRepository priceMstRepository;

	@Override
	public boolean updatePrice(PriceMstEntity priceEntity) {
		if(Objects.nonNull(priceEntity) && Objects.nonNull(priceEntity.getItemCategoryId()) && Objects.nonNull(priceEntity.getPricePerGram())) {
			try {
			Optional<PriceMstDto> existingPrice = priceMstRepository.findById(priceEntity.getItemCategoryId());
			if(existingPrice.isPresent()) {
				priceMstRepository.updatePrice(priceEntity.getPricePerGram().floatValue(), priceEntity.getItemCategoryId());
				return true;
			} else {
				priceMstRepository.save(PriceMstEntity.formDto(priceEntity));
				return true;
			}
			}catch(Exception e) {
				return false;
			}
		} else {
			throw new RuntimeException("Invalid Model");
		}
	}

}
