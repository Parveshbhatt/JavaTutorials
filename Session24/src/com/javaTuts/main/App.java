package com.javaTuts.main;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.javaTuts.dao.DBOperations;
import com.javaTuts.model.Customer;
import com.mysql.cj.xdevapi.Schema.CreateCollectionOptions;

//class App is known as the main class
// Driver class :)
public class App {

	public static void main(String[] args) {
		
		Date date = new Date();
		//System.out.println(date);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateTime = formatter.format(date);
		
		//System.out.println(dateTime);
				
		
//		insert into Customer values(null, 'john', '999991111', 'john@example.com', 98.4, '12:00', 'NA' );
		Customer customer1 = new Customer(1, "John", "999991111", "john@example.com", 98.4f, dateTime, "NA" );

		System.out.println(customer1);
		
		// 1. Load the driver
		DBOperations db = new DBOperations();
		
		//2. Create the Driver
		db.createConnection();
		
		// 3. write and execute SQL statement
		db.insertCustomer(customer1);
		
		// 4. close the connection
		db.closeConnection();
	}

}
