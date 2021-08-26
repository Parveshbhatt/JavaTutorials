package com.javaTuts.exceptionHandling;

import java.util.Scanner;
public class PickFromBothSides {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N:");
		int n = sc.nextInt();
		Integer[] A = new Integer[n] ;
		for (int i =0; i<n; i++) {
			A[i]= sc.nextInt();
		}
		
		System.out.println("Enter B:");
		int B= sc.nextInt();
		int sum=0,sum1=0;
		for(int i=0;i<=B-1;i++) {
			sum+=A[i];
			
		}
		
		sum1= sum;
		
		for(int i=0;i<B;i++) {
			sum -= A[B-1-i];
			sum += A[n-1-i];
			
			if(sum>sum1) {
				sum1 = sum;
			}
			
			
		}
		
System.out.println("sum : "+sum1);
	}

}