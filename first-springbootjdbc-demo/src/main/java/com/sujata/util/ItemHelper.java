package com.sujata.util;

import java.util.Scanner;

import com.sujata.bean.Item;

public class ItemHelper {

	public static Item getItem(){
		Scanner sc=new Scanner(System.in);
		Item item=new Item();
		System.out.println("Enter Item Id : ");
		item.setItemId(sc.nextInt());
		System.out.println("Enter Item Name : ");
		item.setItemName(sc.next());
		System.out.println("Enter Item Quantity : ");
		item.setQuantity(sc.nextInt());
		System.out.println("Enter Item Price : ");
		item.setPrice(sc.nextInt());
		return item;
	}
	
	public static Item getItemforUpdate(int id){
		Scanner sc=new Scanner(System.in);
		Item item=new Item();
		item.setItemId(id);
		System.out.println("Enter new Item Name : ");
		item.setItemName(sc.next());
		System.out.println("Enter new Item Quantity : ");
		item.setQuantity(sc.nextInt());
		System.out.println("Enter new Item Price : ");
		item.setPrice(sc.nextInt());
		return item;
	}
}
