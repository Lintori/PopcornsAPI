package com.lintori.rebyu.Routes;

import com.lintori.rebyu.Entities.Item;
import com.lintori.rebyu.Services.ItemService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemRoutes {

	private final ItemService itemService;

	public ItemRoutes(ItemService itemService) {
		this.itemService = itemService;
	}

	@GetMapping()
	public List<Item> getAllItems() {
		return this.itemService.findAllItems();
	}

	@GetMapping("/{id}")
	public Item getItem(@PathVariable(value = "id") Long requestID) {
		return itemService.findItem(requestID);
	}

	@PostMapping("/{id}")
	public void postItem(@RequestBody Item requestItem) {
		this.itemService.addItem(requestItem);
	}

	@PutMapping("/{id}")
	public void putItem(@RequestBody Item requestItem, @PathVariable(value = "id") long requestID) {
		this.itemService.updateItem(requestItem, requestID);
	}

	@DeleteMapping("/{id}")
	public void deleteItem(@PathVariable(value = "id") long requestID) {
		this.itemService.deleteItem(requestID);
	}

}
