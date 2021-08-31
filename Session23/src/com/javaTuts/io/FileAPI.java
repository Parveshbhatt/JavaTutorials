package com.javaTuts.io;

import java.io.File;

public class FileAPI {

	public static void main(String[] args) {	
		File file = new File("/D:/JavaFile/JavaFileHandling.txt");
		
		// file.createNewFile()
		
		if(file.exists()) {
			System.out.println("File Exists: "+file.getName());
			
			if(file.isFile()) {
				System.out.println(file.getName()+" is a File");
			}
			
			if(file.isDirectory()) {
				
				System.out.println(file.getName()+" is a Directory");
				
			}
		}else {
			System.out.println("Sorry File "+file.getName()+" does not exits");
		}
		
//		File file1 = new File("/D:/JavaFile/FileHandling");
//		file1.mkdir();
		
		File file1 = new File("C:/Users/PARVESH/Downloads");
	/*	String[] names = file1.list();
		for(String name: names) {
			if(name.endsWith(".jpg") || name.endsWith(".jpeg") || name.endsWith(".png")) {
			System.out.println(name);
			}
		} */
		
		File[] files = file1.listFiles();
		for(File f: files) {
			if(f.isDirectory()) {
				
				System.out.println(f.getName());
				
			}
		}
		
		// Take the Path as Input from User
		// List all the documents, images, audios, videos as 4 different categories
		// using File API of Java
		
}
	
	
}
