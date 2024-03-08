package com.practices;

public class LoopExample {
	public static void main(String[] args) {
		
		for(int i=0; i< 5; i++) {
			System.out.println("before break count is " + i);
			
			if(i ==2) {
				System.out.println("invoked");
			break;
		}
	}

}
}
