package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Item;
import com.sujata.bean.ItemList;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public ItemList getAllProducts() {
		ItemList items=restTemplate.getForObject("http://localhost:8086/items", ItemList.class);
		return items;
	}

	@Override
	public Item getProductById(int id) {
		Item item=restTemplate.getForObject("http://localhost:8086/items/"+id, Item.class);
		return item;
	}

	@Override
	public Item getProductByName(String name) {
		Item item=restTemplate.getForObject("http://localhost:8086/items/name/"+name, Item.class);
		return item;
	}

}
