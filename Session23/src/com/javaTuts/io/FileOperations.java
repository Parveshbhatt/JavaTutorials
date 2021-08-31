package com.javaTuts.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;


public class FileOperations {

	public void writeDataInFile(String filePath, String dataToWrite) {
		
		// Work with Text i.e. Character
		
		try {
			File file = new File(filePath);
			//FileWriter writer = new FileWriter(file);
			FileWriter writer = new FileWriter(file, true); // enable append mode
			writer.write(dataToWrite);  // Write a string
			writer.close();
			System.out.println("Data written in File "+file.getName());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void readDataFromFile(String filePath) {
		
		// Work with text i.e. Character
		
		try {
			File file = new File(filePath);
			
			FileReader reader = new FileReader(file);  // Character by Character
			BufferedReader buffer = new BufferedReader (reader);  // to read data from file line by line
			
//			String line = buffer.readLine();
			
			String line = "";
			while((line = buffer.readLine()) != null) {
//				System.out.println(line);
//				if(line.startsWith("import")) {
					if(line.contains("new") && !line.startsWith("//")) {
						System.out.println(line);
					}
				}
					buffer.close();
					reader.close();
					
			}catch(Exception e) {
				e.printStackTrace();
		}
	}
	
	public void writeDataInFileAgain(String filePath, String dataToWrite) {
		
		// Work with Bytes
		
		try {
			
			File file = new File(filePath);
			
			// FileOutputStream stream = new FileOutputStream(file);  //override
			FileOutputStream stream = new FileOutputStream (file, true);  // append
			stream.write(dataToWrite.getBytes()); // writer as bytes
			
			stream.close();
			System.out.println("Data written in File "+file.getName());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	public void readDataFromFileAgain(String filePath) {
		
		// Work with Text i.e. Character
		
		try {
			File file = new File(filePath);
			
			FileInputStream stream = new FileInputStream(file); // byte by byte
//			BufferedReader buffer = new BufferedReader(stream);
			
			
			// Explore how to process line by line
			// if not possible, explore the reason behind it
			
			int i=0;
			while((i = stream.read()) != -1) {
				char ch = (char)i;
				System.out.println(ch);
			}
			
			stream.close();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
