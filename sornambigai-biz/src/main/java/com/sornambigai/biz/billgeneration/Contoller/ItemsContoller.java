package com.sornambigai.biz.billgeneration.Contoller;

import java.net.URI;
import java.util.List;
import java.util.Map;

import com.sornambigai.biz.billgeneration.service.usercheck.model.ItemModel;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sornambigai.biz.billgeneration.service.items.ItemsService;
import com.sornambigai.entity.ItemCategoryMstEntity;
import com.sornambigai.entity.ItemsEntity;

@RestController
@RequestMapping(value = "auth")
public class ItemsContoller {
	@Autowired
	private ItemsService itemsService;

	@GetMapping("/getItems")
	public List<ItemsEntity> getItems(@RequestParam String itemCategoryId ) {
		return itemsService.getFilteredItems(itemCategoryId);
	}

	@GetMapping("/getItemCategories")
	public List<ItemCategoryMstEntity> getItemCategories() {
		return itemsService.getItemCategories();
	}

	@RequestMapping(value = "/addItem", method = RequestMethod.POST)
	public ResponseEntity<ItemModel> addItem(@RequestBody Map<String, String> requestMap) {
		ItemsEntity item = itemsService.addItem(requestMap);

		return ResponseEntity.created(URI.create("/getItem/" + item.getItemId())).body(new ItemModel(item.getItemCategoryId(), item.getItemName()));
	}

	@DeleteMapping(value = "/deleteItem/{id}")
	public boolean deleteItem(@PathVariable String id) {
		return itemsService.deleteItem(id);
	}
}
