package com.main;

import java.util.Scanner;

import com.ServiceImplementation.ProductImplementation;

public class InventoryManagementSystem {

	public static void main(String[] args) {
		ProductImplementation pl= new ProductImplementation();
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to Inventory Management System App");
		char ch;
		do {
			System.out.println("enter the choice");
			System.out.println("1.Add product\n2.Remove Product\n3.Update Product\n4.Display Inventory\n5.Display Total Value\n6.Serach product By product name\n7.Search Product by Category");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:pl.addProduct();
			break;
			case 2:pl.removeProduct();;
			break;
			case 3:pl.updateInventory();;
			break;
			case 4:pl.displayInventory();
			break;
			case 5:pl.disaplyTotalValue();
			break;
			case 6:pl.searchByName();;
			break;
			case 7:pl.searchByCategory();;
			break;
			default:System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}

}
