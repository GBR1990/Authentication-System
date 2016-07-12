package org.gireeshma.reddy.service;

import java.util.HashMap;

import org.gireeshma.reddy.dto.User;

public class LoginService {
	static HashMap<Integer, User> users = new HashMap<Integer, User>();
	
	/*
	 * This method is to get the details into a hashmap from the database.
	 */
	public static void LoginServiceToJDBC() {
		
		Driver d = new Driver();
		users = d.getJDBCresult();
		
		
		
		
	}

	/*
	 * This method is to check for authentication.
	 */
	public boolean authenticate(Integer userId, String password) {
		
		if (password == null || password.trim() == ""
				|| !users.containsKey(userId)) {
			System.out.println("Filtered!");
			
			return false;
		}
		
			return true;
		
	}

	// model
	/*
	 * This method is to set the user details in the bean.
	 */
	public User getUserDetails(int userId) {
		
		User user = new User();
		
		user.setUserName(users.get(userId).getUserName());
		
		user.setUserId(userId);
		
		user.setPassword(users.get(userId).getPassword());
		user.setAge(users.get(userId).getAge());
		System.out.println("The age is:"+user.getAge());
		user.setEmail(users.get(userId).getEmail());
		user.setNumber(users.get(userId).getNumber());
		return user;
		
	}
	
	public int createUser(String username, String password,String age, String email, String number)
	{
		Driver d=new Driver();
		return d.newUser(username, password,age,email,number);
		
	}
}
