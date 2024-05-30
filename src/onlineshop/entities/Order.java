package onlineshop.entities;

import java.util.ArrayList;

public interface Order {
	boolean isCreditCardNumberValid(String userInput);

	void setCreditCardNumber(String userInput);

	void setProducts(ArrayList<Product> products);
}
