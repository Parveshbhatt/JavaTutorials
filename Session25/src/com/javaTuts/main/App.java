package com.javaTuts.main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
//		update customer set name ='John Watson', phone='9999977777' where id =1;

		//		Customer customer1 = new Customer(1, "John", "999991111", "john@example.com", 98.4f, dateTime, "NA" );
//		Customer customer2 = new Customer(2, "Jack", "999992222", "jack@example.com", 98.3f, dateTime, "NA" );
//		Customer customer3 = new Customer(2, "Jennie Miller", "999992244", "millerJ@example.com", 98.7f, dateTime, "NA" );

//		System.out.println(customer1);
		
		//1.
		DBOperations db = new DBOperations();
		//2. 
		db.createConnection();
		
		// 3. write and execute sql statement
//		db.insertCustomer(customer3);
//		db.updateCustomer(customer3);
//		db.deleteCustomer(4);
		
		/*ArrayList<Customer> customers = db.fetchCustomers();
		
		customers.forEach((customer)->{
			System.out.println(customer);
		});*/
		
		db.fetchCustomers().forEach((element)->{
			System.out.println(element);
		});
		
		
		// 4. close the connection
		db.closeConnection();
	}

}
