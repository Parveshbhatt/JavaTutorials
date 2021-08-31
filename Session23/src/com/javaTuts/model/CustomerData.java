package com.javaTuts.model;

import java.io.Serializable;

// Serializable => Marker Interface 
public class CustomerData implements Serializable { // for saving object in file

	public String name;
	String phone;
	// volatile , transient , native
    transient float temperature;  // transient ->  not save this object when serialization 
	String inTime;
	String outTime;
	
	public CustomerData() {
		
	}

	public CustomerData(String name, String phone, float temperature, String inTime, String outTime) {
		this.name = name;
		this.phone = phone;
		this.temperature = temperature;
		this.inTime = inTime;
		this.outTime = outTime;
	}

	@Override
	public String toString() {
		return "CustomerData [name=" + name + ", phone=" + phone + ", inTime=" + inTime + ", outTime=" + outTime + "]";
	}
	
	
	public String toCSV() {
		return name+","+phone+","+temperature+","+inTime+","+outTime+"\n";  //comma separated values
	}
	
}
