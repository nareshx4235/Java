package com.studystd.conditonals;

import java.util.Scanner;

public class Ifstatements {
	public static void main(String[] args) {
		 int age;
		 Scanner sc = new Scanner (System.in); 
		 System.out.println("Enter you age: ");
		 age = sc.nextInt();
		 if (age<18) {
		 System.out.println("You are a minor !");
	}
		 System.out.println("End");
	
	 
	}
}