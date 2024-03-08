package com.practices.exception;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name here:" );
		String name = scanner.nextLine();
		
		System.out.println("your name is: " + name);
		scanner.close();
		

	}

}
