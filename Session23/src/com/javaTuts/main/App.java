package com.javaTuts.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.javaTuts.io.FileOperations;
import com.javaTuts.model.CustomerData;


public class App {

	public static void main(String[] args) {
		
		FileOperations ioOperations = new FileOperations();
		
		CustomerData customer = new CustomerData("John", "9999911111", 98.1f, "12:00", "14:00");
		//CustomerData customer = new CustomerData("Fionna", "9090921212", 98.4f, "13:00", "13:30");
//		CustomerData customer = new CustomerData("Fionna", "9090921212", 98.4f, "13:00", "13:30");
//       CustomerData customer = new CustomerData("Dave", "9019110121", 98.8f, "14:00", "19:30");
//		
//		System.out.println(customer);
//		System.out.println(customer.toCSV());
//		
//		String csvData = customer.toCSV();
		// Write the csvData in file :)
		
		//ioOperations.writeDataInFile("D:/JavaFile/CustomersDetails.csv", csvData);  // fileWriter automatically create file if not exist.
		//ioOperations.writeDataInFileAgain("D:/JavaFile/CustomersDetails.csv", csvData);
		
//		String path = "D:/JavaFile/CustomersDetails.csv";
//		ioOperations.readDataFromFile(path);
		
//      CustomerData customer = new CustomerData("Dave", "9019110121", 98.8f, "14:00", "19:30");

      //Serialization => directly writing or saving object in file 
      // all NO-SQL database use Serialization
      // save data not as normal text file (Dave.txt)
     
//      try {
//    	  String path = "D:/JavaFile/"+customer.name+".txt";
//          File file = new File(path);
//		FileOutputStream stream = new  FileOutputStream(file);
//		
//		
//		// Serialization => Save the state of an object in file from Memory(RAM) in file.
//		ObjectOutputStream objectStream = new ObjectOutputStream(stream);   // IO Chaining
//		objectStream.writeObject(customer);
//		
//		objectStream.close();
//		stream.close();
//		System.out.println("object Saved");
// 
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
      
      
      // DeSerialization => Construct the object back in Memory(RAM) from the file.
      try {
    	  String path = "D:/JavaFile/"+customer.name+".txt";
          File file = new File(path);
		FileInputStream stream = new  FileInputStream(file);
		
		
		// Serialization => Save the state of an object in file
		ObjectInputStream objectStream = new ObjectInputStream(stream);   // IO Chaining
		CustomerData cRef = (CustomerData)objectStream.readObject();  // Casting , because it retruns otherwise parent class object
		
		objectStream.close();
		stream.close();
		System.out.println(cRef);

	} catch (Exception e) {
		e.printStackTrace();
	}
      
      
	}
       
}
