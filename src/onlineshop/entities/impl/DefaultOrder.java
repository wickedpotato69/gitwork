package onlineshop.entities.impl;

import java.util.ArrayList;

import onlineshop.entities.Order;
import onlineshop.entities.Product;

public class DefaultOrder implements Order{
		private static final int AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER = 16;
	
		
	private String creditCardNumber;
	private ArrayList<Product> products;
	private int customerId;
	
	public DefaultOrder(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public boolean isCreditCardNumberValid(String creditCardNumber) {
		return creditCardNumber.length() == AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER;
	}

	@Override
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	@Override
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	
}
