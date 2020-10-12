package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sujata.bean.Item;
import com.sujata.persistence.ItemDao;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;
	
	
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	@Override
	public List<Item> getAllItems() {
		return itemDao.getAllRecords();
	}

	@Override
	public boolean addItem(Item item) {
		
		return itemDao.addRecord(item);
	}

	@Override
	public boolean deleteItem(int id) {
		
		return itemDao.deleteRecord(id);
	}

	@Override
	public boolean updateItem(int id, Item newItem) {
		
		return itemDao.updateRecord(id, newItem);
	}

	@Override
	public Item getItem(int id) {
		return itemDao.getRecord(id);
	}

}
