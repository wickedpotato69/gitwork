package onlineshop.entities.impl;

import java.util.ArrayList;

import onlineshop.entities.Cart;
import onlineshop.entities.Product;

public class DefaultCart implements Cart{
	private ArrayList<Product> products;
	
	@Override
	public boolean isEmpty() {
		return (products.size() == 0);
	}

	@Override
	public void addProduct(Product product) {
		products.add(product);
	}

	@Override
	public ArrayList<Product> getProducts() {
		return products;
	}

	@Override
	public void clear() {
		products.clear();
	}
}
