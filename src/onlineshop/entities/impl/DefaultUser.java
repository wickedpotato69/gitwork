package onlineshop.entities.impl;

import onlineshop.entities.User;

public class DefaultUser implements User{
	
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	private String Id;
	private static Integer NextUser = 1;
	
	public DefaultUser(String firstName, String lastName, String password, String email) {
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Password = password;
		Id = "USER" + NextUser.toString();
		NextUser++;
	}
	
	
	@Override
	public String getFirstName() {
		return FirstName;
	}

	@Override
	public String getLastName() {
		return LastName;
	}

	@Override
	public String getPassword() {
		return Password;
	}

	@Override
	public String getEmail() {
		return Email;
	}

	@Override
	public String getId() {
		return Id;
	}

	@Override
	public void setPassword(String newPassword) {
		Password = newPassword;
	}

	@Override
	public void setEmail(String newEmail) {
		Email = newEmail;
	}

}
