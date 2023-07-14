package com.Service;

public class InventoryItems {
	Product p;
	int quntity;
	public InventoryItems(Product p, int quntity) {
		super();
		this.p = p;
		this.quntity = quntity;
	}
	public Product getP() {
		return p;
	}
	public void setP(Product p) {
		this.p = p;
	}
	public int getQuntity() {
		return quntity;
	}
	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}
	@Override
	public String toString() {
		return "InventoryItems [p=" + p + ", quntity=" + quntity + "]";
	}
	

}
