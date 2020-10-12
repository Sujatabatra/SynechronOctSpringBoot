package com.sujata.persistence;

import java.util.List;

import com.sujata.bean.Item;

public interface ItemDao {

	List<Item> getAllRecords();
	boolean addRecord(Item item);
	boolean deleteRecord(int id);
	boolean updateRecord(int id,Item newItem);
	Item getRecord(int id);
}
