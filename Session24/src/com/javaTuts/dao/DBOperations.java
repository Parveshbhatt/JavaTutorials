 package com.javaTuts.dao; //database access object

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.javaTuts.model.Customer;

/*
 
 For java App to Connect to Database MySQL , we need to follow a Procedure
 
 // Reference  to Jar file -> https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.26
  
  1.Load the Driver in our App
  		1.1 Download the MySQL Driver jar file
  		1.2 Link the Jar File in Your Project Structure
  		1.3 Use the API Class.forname() to Load the Driver class in the App
 2. Create Connection with DataBase
 	2.1 Information to connect to DB
 	user = root
 	password = ************
 	url = jdbc:mysql://localhost/pj2021db
 	
 	2.2 use the API Connection and DriverManager to create Connection
 		APIs are from java.sql package
 
  3. Create SQL Statement and Execute it
     3.1 To Create SQL Statement use API Statement
     
  
  4. Close the Connection 
 */




public class DBOperations {
	
	Connection connection;
	Statement statement;

	public DBOperations() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver Loaded :)");
			
		} catch (Exception e) {
			System.out.println("Something went wrong: "+e);
		}
	}
	
	public void createConnection() {
		try {
			
			String user = "root";
			String password = "Parvesh@#123";   
			String url = "jdbc:mysql://localhost/pj2021db";
			
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("2. Connection created :)");
			
		} catch (Exception e) {
			System.out.println("Something went wrong: "+e);
		}
	}
	
	public void insertCustomer(Customer customer) {
		try {
			
			statement = connection.createStatement();
			System.out.println("4.1 Statement Created :)");
			
			String sql = "insert into Customer values(null, '"+customer.name+"', '"+customer.phone+"', '"+customer.email+"', "+customer.temperature+", '"+customer.inTime+"', '"+customer.outTime+"' );";
			
			// executeUpdate() -> insert, update, delete in DataBase
			// executeQuery() -> select data from DataBase
			int row = statement.executeUpdate(sql);
			System.out.println(customer.name+ "  is inserted at row: "+row);
			
		} catch (Exception e) {
			System.out.println("Something went wrong: "+e);
		}
	}
	 
	
	public void closeConnection() {
		try {
			
			connection.close();
			System.out.println("4. Connection Closed :) ");
			
		} catch (Exception e) {
			System.out.println("Something went wrong: "+e);
		}
	}
	
}
