package com.javaTuts.model;

import java.util.Scanner;

/*// ORM : Object Reloational Mapping
 int id;
 String name;
 
 String phone;
 String email;
 float temperature;
 String inTime;
 String outTime;
 
create table Customer(
 id int primary key auto_increment,
 name varchar(256),
 phone varchar(20),
 email varchar(20),
 temperature float,
 inTime  varchar(100),
 outTime  varchar(100)
 ) 

*/


public class Customer {
	
	public int id;
	public String name;
	public String phone;
	public String email;
	public float temperature;
	public String inTime;
	public String outTime;
	
	public Customer(){
		
	}
	
	
	public Customer(int id, String name, String phone, String email, float temperature, String inTime, String outTime) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.temperature = temperature;
		this.inTime = inTime;
		this.outTime = outTime;
	}
	
	public void inputDetails() {
		Scanner sc = new Scanner(System.in);
		// Take data as input from user	
		
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", temperature="
				+ temperature + ", inTime=" + inTime + ", outTime=" + outTime + "]";
	}
	
	

}
