package com.practices;

import java.util.Arrays;

public class InsertionSortPractice {
	
	public static void main(String[] args) {
		int[] numOne = {9, 2, 6, 22, 12, 15, 1, 5};  
		
		for(int i=0; i< numOne.length; i++) {
			for(int j=i+1; j< numOne.length; j++) {
				
				if(numOne[j] < numOne[i]) {
				int current = numOne[i];
				numOne[i] = numOne[j];
				numOne[j] = current;
				}				
			}
			
		}
		System.out.println("Final array in ascending order is: " + Arrays.toString(numOne));
	}

}



//2 9 6 22 12 15;
//2 6 9 22 12 15
//i =2 , j =3 : 2 6 9 
//i = 3, j = 4: 2 6 9 
 
 
