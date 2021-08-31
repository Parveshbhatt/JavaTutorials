package com.javaTuts.dao; //database access object

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.javaTuts.model.Customer;

public class DBOperations {
	
	Connection connection;
	Statement statement;  // Interface
	
	PreparedStatement preparedStatement;  // Interface

	public DBOperations() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver Loaded");
			
		} catch (Exception e) {
			System.out.println("Something went wrong: "+e);
		}
	}
	
	public void createConnection() {
		try {
			
			String url = "jdbc:mysql://127.0.0.1/pj2021db";
			String user = "root"; 
			String password = "Parvesh@#123";   
			
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("2. Connection created :)");
			
		} catch (Exception e) {
			System.out.println("Something went wrong: "+e);
		}
	}
	
	public void insertCustomer(Customer customer) {

		try {
			
//			statement = connection.createStatement();
//			System.out.println("4.1 Statement Created :)");
//			
//			String sql = "insert into Customer values(null, '"+customer.name+"', '"+customer.phone+"', '"+customer.email+"', "+customer.temperature+", '"+customer.inTime+"', '"+customer.outTime+"' );";
			
			
			//Explore:
			// String Formatting in Java
			// i.e How can we substitute data in Strings without concatenation
			
			
			String sql = "insert into Customer values(null, ?, ?, ?, ?, ?, ?)";  //? wildcard character always be  ?
			preparedStatement = connection.prepareStatement(sql);
			
			// Indexing of ? i.e, wild card starts from 1
			preparedStatement.setString(1, customer.name);
			preparedStatement.setString(2, customer.phone);
			preparedStatement.setString(3, customer.email);
			preparedStatement.setFloat(4, customer.temperature);
			preparedStatement.setString(5, customer.inTime);
			preparedStatement.setString(6, customer.outTime);
			
			
			// executeUpdate() -> 
			int rows = preparedStatement.executeUpdate();
			if(rows>0) {
				System.out.println("4.2 "+customer.name+" inserted");
			}else {
				System.out.println("4.2 Insert Failed");
			}
//			System.out.println(customer.name+ "  is inserted" );
			
		} catch (Exception e) {
			System.out.println("Something went wrong: "+e);

		}
	}
	
	
	public void updateCustomer(Customer customer) {

		try {
			
			String sql = "update customer set name=?, phone=? ,  temperature=?, inTime=?, outTime=? where id=?";
			preparedStatement = connection.prepareStatement(sql);
			
			// Indexing of ? i.e, wild card staers from 1
			preparedStatement.setString(1, customer.name);
			preparedStatement.setString(2, customer.phone);
			preparedStatement.setFloat(3, customer.temperature);
			preparedStatement.setString(4, customer.inTime);
			preparedStatement.setString(5, customer.outTime);
			preparedStatement.setInt(6, customer.id);
			
			
			
			// executeUpdate() -> 
			int rows = preparedStatement.executeUpdate();
			if(rows>0) {
				System.out.println("4.2 "+customer.name+" updated");
			}else {
				System.out.println("4.2 update Failed  :(");
			}
//			System.out.println(customer.name+ "  is inserted" );
			
		} catch (Exception e) {
			System.out.println("Something went wrong: "+e);
		}
	}
		
	public void deleteCustomer(int id) {

		try {
			
//			String sql = "delete from Customer where id =?";
			String sql = "delete from customer where id= "+id;
			preparedStatement = connection.prepareStatement(sql);
			
			// Indexing of ? i.e, wild card staers from 1

//			preparedStatement.setInt(1, id);
			
			
			
			// executeUpdate() -> 
			int rows = preparedStatement.executeUpdate();
			if(rows>0) {
				System.out.println("4.2 Customer with ID "+id +" deleted");
			}else {
				System.out.println("4.2 delete Failed :(");
			}
//			System.out.println(customer.name+ "  is inserted" );
			
		} catch (Exception e) {
			System.out.println("Something went wrong: "+e);
		}
	}
		
	public ArrayList<Customer> fetchCustomers() {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		try {
			
			String sql = "select * from customer";
//			String sql = "select * from customer where id =1";
//			String sql = "select * from customer where phone=9999911111";
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeQuery();
			
			// Fetched data from Table is available in ResultSet
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Customer customer = new Customer();
				// Here, resultSet indexing i.e. columns in table starts from 1
				// customer.id = resultSet.getInt("id");
				
				customer.id = resultSet.getInt(1);
				customer.name = resultSet.getString(2);
				customer.phone = resultSet.getString(3);
				customer.email= resultSet.getString(4);
				customer.temperature = resultSet.getFloat(5);
				customer.inTime = resultSet.getString(6);
				customer.outTime = resultSet.getString(7);
				
//				System.out.println(customer);
//				System.out.println();
				
				customers.add(customer);
			}
			
		} catch (Exception e) {
			System.out.println("Something went wrong: "+e);

		}
		
		return customers;
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
