package com.sujata.service;

import java.util.List;

import com.sujata.bean.Item;

public interface ItemService {

	List<Item> getAllItems();
	Item getItemById(int id);
	Item findItemByName(String itemName);
	Item insertItem(Item item);
	Item deleteItem(int id);
}
