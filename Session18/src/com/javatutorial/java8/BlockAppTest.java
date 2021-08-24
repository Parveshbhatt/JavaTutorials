package com.javatutorial.java8;

class MyBlock{
	{
		System.out.println("My Block 2");
	}
	
	{
		System.out.println("My Block 1");
	}
	
	static {
		System.out.println("My Static Block2");
	}
	
	static {
		System.out.println("My Static Block1");
	}
	
	MyBlock(){
		System.out.println("My Block constructor");
	}
}

public class BlockAppTest {


	{
		System.out.println("BlockAppTest Block");
	}
	
	static {
		System.out.println("BlockAppTest static Block");
	}
	
	BlockAppTest(){
		System.out.println("BlockAppTest Default constructor");
	}
	
	
	public static void main(String[] args) {

		System.out.println("Main Started");
		
		MyBlock block1 = new MyBlock();
		
		BlockAppTest app = new BlockAppTest();
		
		System.out.println("Main finished");
		
		
		
	}

}
