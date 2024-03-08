package com.practices;
import java.util.Scanner;

public class BreakExample2 {

	//break terminates the loop as soon as it meets the condition inside the loop.
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter your name:");
		String name2 = scan.nextLine();
		for(int i=0; i < name2.length(); i++) {
			if((name2.charAt(i)) == 'a' ) {
				break;
			}
			System.out.println(name2.charAt(i));
		}
		scan.close();
		
	}
		
	

}
