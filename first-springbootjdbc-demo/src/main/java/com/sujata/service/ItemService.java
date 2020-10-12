package com.sujata.service;

import java.util.List;

import com.sujata.bean.Item;

public interface ItemService {

	List<Item> getAllItems();
	boolean addItem(Item item);
	boolean deleteItem(int id);
	boolean updateItem(int id,Item newItem);
	Item getItem(int id);
}
