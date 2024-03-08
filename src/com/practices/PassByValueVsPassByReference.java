package com.practices;

public class PassByValueVsPassByReference {

	public static void main(String[] args) {

		//pass by value. for primitive java uses pass by value.
		int x = 5;
		modifyValue(x);
		System.out.println("value outside the method is " + x); 

		
		// pass by reference. for objects reference java uses pass by reference.
		StringBuilder str = new StringBuilder("Hello");
		modifyString(str);
		System.out.println(str); 
	}

	public static void modifyValue(int num) {
		num = num * 2;
		System.out.println("value inside this method is " + num);
	}

	public static void modifyString(StringBuilder s) {
		s.append(" World");
	}

}
