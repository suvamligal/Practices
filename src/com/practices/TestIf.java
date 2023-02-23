package com.practices;

public class TestIf {

	public static void main(String[] args) {
		
		int numOne =2;
		int numTwo =3;
		
		// ctrl + shift + \ -> to uncommment (block comment/uncomment).
		
		try {
			if(numOne < numTwo) {
				if(numOne == 2) {
					System.out.println("value is 2");
					return;
				}
				System.out.println("outside inner if block");
				return;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
