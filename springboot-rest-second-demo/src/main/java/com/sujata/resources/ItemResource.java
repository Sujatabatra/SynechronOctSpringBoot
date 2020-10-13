package com.sujata.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Item;
import com.sujata.service.ItemService;

import net.bytebuddy.asm.Advice.Return;

@RestController
@RequestMapping("/items")
public class ItemResource {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Item> getAllItemsResource(){
		return itemService.getAllItems();
	}

	@RequestMapping("/name/{name}")
	public Item getItemByName(@PathVariable("name") String name){
		return itemService.findItemByName(name);
	}
	
	@RequestMapping(path="/{id}",method=RequestMethod.DELETE)
	public Item removeItem(@PathVariable("id")int id){
		return itemService.deleteItem(id); 
	}
	@RequestMapping(path="/{id}",method=RequestMethod.GET)
	public Item findItemById(@PathVariable("id")int id){
		return itemService.getItemById(id);
	}
	
	@RequestMapping("/{firstname}/{lastname}")
	public String dummy(@PathVariable("firstname")String fname,@PathVariable("lastname")String lname){
		return fname+" "+lname;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity saveItem(@RequestBody Item item){
		Item it=itemService.insertItem(item);
		return new ResponseEntity<Item>(it,HttpStatus.CREATED);
	}
	
	
}
