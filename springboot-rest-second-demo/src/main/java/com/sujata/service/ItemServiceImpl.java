package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Item;
import com.sujata.persistence.ItemDao;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;
	
	@Override
	public List<Item> getAllItems() {
		
		return itemDao.findAll();
	}

	@Override
	public Item getItemById(int id) {
		
		return itemDao.findById(id).get();
	}

	@Override
	public Item findItemByName(String itemName) {
		return itemDao.getItemByName(itemName);
	}

	@Override
	public Item insertItem(Item item) {
		return itemDao.save(item);
	}

	@Override
	public Item deleteItem(int id) {
		Item item=getItemById(id);
		itemDao.deleteById(id);
		return item;
	}

}
