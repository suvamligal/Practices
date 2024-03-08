package com.practices;
import java.util.Scanner;

public class ContinueExample {

	//Continue skips the current iteration inside the loop when it matches the condition and resumes at another iteration.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name2 = scan.nextLine();
		for (int i = 0; i < name2.length(); i++) {
			if ((name2.charAt(i)) == 'a') {
				continue;
			}
			System.out.println(name2.charAt(i));
		}
		scan.close();
	}

}
