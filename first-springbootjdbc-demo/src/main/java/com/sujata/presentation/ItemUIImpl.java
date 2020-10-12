package com.sujata.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.bean.Item;
import com.sujata.service.ItemService;
import com.sujata.util.ItemHelper;

@Component("itemUi")
public class ItemUIImpl implements ItemUI {

	@Autowired
	private ItemService itemService;
	
	
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

	@Override
	public void showMenu() {
		System.out.println("1. Add Item");
		System.out.println("2. Show All Items");
		System.out.println("3. Search Item");
		System.out.println("4. Delete Item");
		System.out.println("5. Update Item");
		System.out.println("6. Exit");

	}

	@Override
	public void perform(int choice) {
		Scanner sc=new Scanner(System.in);
		switch (choice) {
		case 1:
			Item item=ItemHelper.getItem();
			if(itemService.addItem(item))
				System.out.println("Item Added!!");
			else
				System.out.println("item not Added!!");
			break;
		case 2:
			List<Item> items=itemService.getAllItems();
			for(Item item1:items){
				System.out.println(item1);
			}
			break;
		case 3:
			System.out.println("Enter Item Id to be searched for :");
			int itemId=sc.nextInt();
			Item item2=itemService.getItem(itemId);
			if(item2!=null)
				System.out.println(item2);
			else
				System.out.println("Item not found");
			break;
		case 4:
			System.out.println("Enter Item Id to be deleted : ");
			int id=sc.nextInt();
			if(itemService.deleteItem(id))
				System.out.println("Item Deleted");
			else
				System.out.println("Item Not Deleted");
			break;
		case 5:
			System.out.println("Enter Item ID whoes values you want to update : ");
			int itemNo=sc.nextInt();
			Item newItem=ItemHelper.getItemforUpdate(itemNo);
			if(itemService.updateItem(itemNo, newItem))
				System.out.println("Item Updated");
			else
				System.out.println("Item Not Updated");
			break;
		case 6:
			System.out.println("Good Bye!!!");
			System.exit(0);

		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
