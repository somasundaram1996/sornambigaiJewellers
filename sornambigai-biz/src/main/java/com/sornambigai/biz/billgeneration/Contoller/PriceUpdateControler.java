package com.sornambigai.biz.billgeneration.Contoller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sornambigai.biz.billgeneration.service.priceupdate.PriceUpdateService;

@RestController
@RequestMapping(value = "auth")
public class PriceUpdateControler {

	@Autowired
	private PriceUpdateService priceUpdateService;

	@RequestMapping(value = "/updatePrice", method = RequestMethod.POST)
	public boolean addItem(@RequestBody Map<String, Object> requestMap) {
		return priceUpdateService.updatePrice(requestMap);
	}
}
