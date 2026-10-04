package com.demo.scanner;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number : ");
		int i=sc.nextInt();
		
		System.out.print("Enter second number : ");
		int j=sc.nextInt();
		
		System.out.println("Result : "+(i+j));
		
		sc.close();
	}
}
