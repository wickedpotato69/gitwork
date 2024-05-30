package onlineshop.entities.impl;

import onlineshop.entities.Product;

public class DefaultProduct implements Product{
	private String id;
	private String productName;
	private String categoryName;
	private double price;
	private static Integer Nextproduct = 1;

	public DefaultProduct() {
	}
	
	public DefaultProduct(String productName, String categoryName, double price) {
		this.productName = productName;
		this.price = price;
		this.id = "PRODUCT" + Nextproduct.toString();
	}

	@Override
	public String toString() {
		return id + " " + productName;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public String getProductName() {
		return this.productName;
	}
}
