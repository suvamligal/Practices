package com.practices;

public class ContinueExample2 {
	
	//Continue skips the current iteration inside the loop when it matches the condition and resumes at another iteration.
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i < 4) {
				continue;
			}
			System.out.println("value of i is " + i);
		}
	}

}
