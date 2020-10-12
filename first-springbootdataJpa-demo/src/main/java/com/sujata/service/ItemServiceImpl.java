package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sujata.bean.Item;
import com.sujata.persistence.ItemDao;

@Service
@Transactional(readOnly=false)
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao itemDao;
	
	@Override
	public List<Item> getAllItems() {
		
		return itemDao.findAll();
	}

	@Override
	public boolean addItem(Item item) {
		Item it=itemDao.save(item);
		return it!=null;
		
		
	}

	@Override
	public boolean deleteItem(int id) {
		itemDao.deleteById(id);
		return true;
	}

	@Override
	public boolean updateItem(int id, Item newItem) {

		itemDao.updateName(id, newItem.getItemName());
		return true;
	}

	@Override
	public Item getItem(int id) {
		// TODO Auto-generated method stub
		return itemDao.findById(id).get();
	}

}
