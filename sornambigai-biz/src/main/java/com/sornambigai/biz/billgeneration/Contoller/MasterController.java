package com.sornambigai.biz.billgeneration.Contoller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sornambigai.entity.ItemCategoryMstEntity;
import com.sornambigai.repositories.ItemCategoryMstRepository;

@RestController
@RequestMapping(value = "noAuth/master")
public class MasterController {

	@Autowired
	private ItemCategoryMstRepository itemCategoryRepository;

	@RequestMapping(value = "/addItemCategory", method = RequestMethod.POST)
	public int addItemCategory(@RequestBody Map<String, Object> requestMap) {
		ItemCategoryMstEntity category = new ItemCategoryMstEntity();
		category.setItemCategoryId(String.valueOf(requestMap.get("categoryId")));
		category.setItemCategoryName(String.valueOf(requestMap.get("categoryName")));
		itemCategoryRepository.save(ItemCategoryMstEntity.formDto(category));
		return 1;
	}

}
