package com.sujata.service;

import java.util.List;

import com.sujata.bean.Item;
import com.sujata.bean.ItemList;

public interface ProductService {
	
	ItemList getAllProducts();
	Item getProductById(int id);
	Item getProductByName(String name);

}
