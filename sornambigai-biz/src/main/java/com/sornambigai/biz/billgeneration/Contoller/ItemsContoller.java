package com.sornambigai.biz.billgeneration.Contoller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sornambigai.biz.billgeneration.service.items.ItemsService;
import com.sornambigai.entity.ItemCategoryMstEntity;
import com.sornambigai.entity.ItemsEntity;

@RestController
@RequestMapping(value = "auth")
public class ItemsContoller {
	@Autowired
	private ItemsService itemsService;

	@RequestMapping(value = "/getItems", method = RequestMethod.POST)
	@ResponseBody
	public List<ItemsEntity> getItems(@RequestBody Map<String, Object> requestMap) {
		return itemsService.getFilteredItems(requestMap);
	}

	@RequestMapping(value = "getItemCategories", method = RequestMethod.POST)
	public List<ItemCategoryMstEntity> getItemCategories(@RequestBody Map<String, Object> requestMap) {
		return itemsService.getItemCategories();
	}

	@RequestMapping(value = "/addItem", method = RequestMethod.POST)
	public boolean addItem(@RequestBody Map<String, String> requestMap) {
		return itemsService.addItem(requestMap);
	}
}
