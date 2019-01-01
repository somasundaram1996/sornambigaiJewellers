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
import com.sornambigai.entity.ItemSubtypeDetailsEntity;
import com.sornambigai.entity.ItemsEntity;

@RestController
public class ItemsContoller {
	@Autowired
	private ItemsService itemsService;
	
	@RequestMapping(value="/getItems",method=RequestMethod.POST)
	@ResponseBody
	public List<ItemsEntity> getItems(@RequestBody Map<String,Object>requestMap){
		return itemsService.getAllItems();
	}
	
	@RequestMapping(value="/getSubtypeDetails",method=RequestMethod.POST)
	public List<ItemSubtypeDetailsEntity> getSubTypeDetails(@RequestBody Map<String,Object> requestMap){
		return itemsService.getSubTypeDetails();
	}
}
