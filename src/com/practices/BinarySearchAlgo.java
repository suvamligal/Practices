package com.practices;

import java.util.Scanner;

public class BinarySearchAlgo {

	public static void main(String[] args){
		int[] sortedItems = {5,7,9,12,18,22,25,29,35};
		//                   0,1,2, 3, 4, 5, 6, 7, 8

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your target value:");
		int targetValue = scan.nextInt();
	
		int indexMid = (sortedItems.length/2);
		
		boolean found = false;
		int indexLow = 0;
		int indexHigh = sortedItems.length -1;
				
		while(found != true) {
			if(sortedItems[indexMid] == targetValue) {
				found = true;
				System.out.println("Number found at index: " + indexMid);
				System.out.println("Target is: " + targetValue);
				break;				
			}
			else if (targetValue > sortedItems[indexMid]) {
				indexLow = indexMid + 1;
				indexMid = (indexLow + indexHigh)/2;
			}
			else if(targetValue < sortedItems[indexMid]) {
				indexHigh = indexMid -1;
				indexMid = (indexLow + indexHigh)/2;
			}
			if (indexLow > indexHigh) {
				System.out.println("Not Found");
				break;
			}
		}	
	}
	}


