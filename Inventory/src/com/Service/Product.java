package com.Service;

import java.util.ArrayList;

public class Product {
	int id;
	String name;
	Category c;
	double price;
	int quntity;
	public Product() {
		
	}
	public Product(int id, String name, Category c, double price, int quntity) {
		super();
		this.id = id;
		this.name = name;
		this.c = c;
		this.price = price;
		this.quntity = quntity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getC() {
		return c;
	}
	public void setC(Category c) {
		this.c = c;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuntity() {
		return quntity;
	}
	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "," + c + ", price=" + price + ", quntity=" + quntity + "]";
	}



}