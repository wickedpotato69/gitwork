package onlineshop.entities;

public interface User {
	//getters, their setters is via constructor
	String getFirstName();
	String getLastName();
	String getPassword();
	String getEmail();
	String getId();
	
	void setPassword(String newPassword);
	void setEmail(String newEmail);
}
