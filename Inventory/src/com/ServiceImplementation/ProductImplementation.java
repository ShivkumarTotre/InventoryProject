package com.ServiceImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.Service.Category;
import com.Service.InventoryManagement;
import com.Service.Product;

public class ProductImplementation implements InventoryManagement{
	
	Product p = new Product();
	Category ct= new Category();
	Scanner sc= new Scanner (System.in);
	ArrayList<Product> prodAl= new ArrayList<>();
	//ArrayList<Category> catAl=new ArrayList<>();
	HashMap<Integer,ArrayList<Product>> hs= new HashMap<>();
	
	@Override
	public void addProduct() {
		System.out.println("enter the total number of product");
		int productSize= sc.nextInt();
		for(int i=0;i<productSize;i++) {
			System.out.println("enter the product id");
			int prodId=sc.nextInt();
			System.out.println("enter the product name");
			String prodName=sc.next();
			System.out.println("enter the product price");
			double prodPrice=sc.nextDouble();
			System.out.println("enter the product category details");
			System.out.println("enter the product category id");
			int prodCategoryId=sc.nextInt();
			System.out.println("enter the product category name");
			String prodCategoryName=sc.next();
			System.out.println("enter the total quntity");
			int prodQuntity=sc.nextInt();
			prodAl.add(new Product(prodId,prodName,new Category(prodCategoryId,prodCategoryName),prodPrice,prodQuntity));
			hs.put(prodId, prodAl);
			
		}		
	}

	@Override
	public void removeProduct() {
		System.out.println("enter the product id you want to remove");
		int productId=sc.nextInt();
		if(prodAl.isEmpty()) {
			System.out.println("product not found");
		}
		else {
			for(int i=0;i<prodAl.size();i++) {
				if(productId==prodAl.get(i).getId()) {
					prodAl.remove(i);
					System.out.println("product sucessfully removed...");
				}
			}
		}
		
	}

	@Override
	public void updateInventory() {
		char ch;
		do{
			System.out.println("enter the choice");
			System.out.println("1.Update Product price\n2.Update quntity");
			int choice=sc.nextInt();
			System.out.println("enter the product id you want to update");
			int productId=sc.nextInt();
			switch(choice) {
			case 1: 
				if(prodAl.isEmpty()) {
					System.out.println("product not found");
				}else {
					for(int i=0;i<prodAl.size();i++) {
						if(productId==prodAl.get(i).getId()) {
							System.out.println("enter the new price");
							int updatedPrice=sc.nextInt();
							prodAl.get(i).setPrice(updatedPrice);
						}
					}
				}
			break;
			case 2:
				if(prodAl.isEmpty()) {
					System.out.println("product not found");
				}else {
					for(int i=0;i<prodAl.size();i++) {
						if(productId==prodAl.get(i).getId()) {
							System.out.println("enter the quntity");
							int updatedQuntity=sc.nextInt();
							prodAl.get(i).setQuntity(updatedQuntity);
						}
					}
				}
			}
			System.out.println("Do you want to continue");
		
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		
	}

	@Override
	public void displayInventory() {
		if(prodAl.isEmpty()) {
			System.out.println("product not found");
		}else {
			for(int i=0;i<prodAl.size();i++) {
				System.out.println(prodAl.get(i));
			}
		}
	}

	@Override
	public void disaplyTotalValue() {
		HashMap<String,Double> hm= new HashMap<>();
		Iterator<Product>itr=prodAl.iterator();
		while(itr.hasNext()) {
			Product pt=itr.next();
			double totalvalue=pt.getQuntity()*pt.getPrice();
			if(hm.containsKey(pt.getName())) {
				double total=hm.get(pt.getName());
				totalvalue=totalvalue+total;
				hm.put(pt.getName(), totalvalue);
			}else {
				hm.put(pt.getName(), totalvalue);
			}
		}
		for(Map.Entry<String, Double> me:hm.entrySet()) {
			System.out.println(me.getKey()+ " "+me.getValue());
		}
		
	}

	@Override
	public void searchByName() {
		System.out.println("enter the product name you want search");
		String name= sc.next();
		if(prodAl.isEmpty()) {
			System.out.println("product not found");
		}else {
			for(int i=0;i<prodAl.size();i++) {
				if(name.equalsIgnoreCase(prodAl.get(i).getName())) {
					System.out.println("product found");
					System.out.println(prodAl.get(i));
				}
			}
		}
		
	}

	@Override
	public void searchByCategory() {
		System.out.println("enter the product category you want search");
		String category= sc.next();
		if(prodAl.isEmpty()) {
			System.out.println("product not found");
		}else {
			for(int i=0;i<prodAl.size();i++) {
				if(category.equalsIgnoreCase(prodAl.get(i).getC().getName())) {
				System.out.println("product found");
				System.out.println(prodAl.get(i));
				}
				
			}
		}
	}

}