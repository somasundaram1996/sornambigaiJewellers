package com.sornambigai.biz.billgeneration.service.priceupdate;

import java.math.BigDecimal;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.sornambigai.dao.PriceMstDao;
import com.sornambigai.entity.PriceMstEntity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PriceUpdateServiceImpl implements PriceUpdateService {

	private final PriceMstDao priceMstDao;

	@Override
	public boolean updatePrice(Map<String, Object> requestMap) {
		PriceMstEntity priceMstEntity = new PriceMstEntity();
		priceMstEntity.setItemCategoryId(String.valueOf(requestMap.get("itemCategoryId")));
		priceMstEntity
				.setPricePerGram(BigDecimal.valueOf(Float.parseFloat(String.valueOf(requestMap.get("pricePerGram")))));
		return priceMstDao.updatePrice(priceMstEntity);
	};

}
