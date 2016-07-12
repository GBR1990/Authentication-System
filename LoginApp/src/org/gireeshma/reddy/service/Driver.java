package org.gireeshma.reddy.service;

import java.sql.*;
import java.util.HashMap;

import org.gireeshma.reddy.dto.User;

public class Driver {

	static HashMap<String, String> passwords = new HashMap<String, String>();
	static HashMap<Integer, User> users = new HashMap<Integer, User>();
	static int ID = 0;

	/*
	 * This method is to get the result of the select statement.
	 */
	public static HashMap<Integer, User> getJDBCresult() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 1.get connection
			Connection myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/database", "root", "root");

			// 2.create a statement
			Statement myStat = myConn.createStatement();

			// 3.execute the query
			ResultSet myRes = myStat.executeQuery("select * from usertable;");

			// 4.process the result set
			while (myRes.next()) {
				User u = new User();
				u.setUserId(Integer.parseInt(myRes.getString("id")));

				u.setUserName(myRes.getString("username"));
				u.setPassword(myRes.getString("password"));
				u.setAge(myRes.getString("age"));
				u.setEmail(myRes.getString("email"));
				u.setNumber(myRes.getString("number"));

				users.put(Integer.parseInt(myRes.getString("id")), u);

			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return users;

	}

	/*
	 * This method is to insert the details of a new user.
	 */
	public int newUser(String username, String password, String age, String email, String number) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 1.get connection
			Connection myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/database", "root", "root");

			// 2.create a statement
			Statement myStat = myConn.createStatement();

			// 3.execute the query
			myStat.executeUpdate("insert into usertable(username,password,age,email,number) values('"
					+ username + "','" + password + "','"+age+"','"+email+"','"+number+"');");
			ResultSet myRes = myStat.executeQuery("SELECT LAST_INSERT_ID();");

			// 4.process the result set
			while (myRes.next()) {
				ID = (myRes.getInt(1));
				User u = new User();
				u.setUserId(ID);
				u.setUserName(username);
				u.setPassword(password);
				u.setAge(age);
				u.setEmail(email);
				u.setNumber(number);

			}
			return ID;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}

	}

}
