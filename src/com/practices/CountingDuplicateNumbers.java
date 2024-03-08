package com.practices;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingDuplicateNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name:");
		
		String name = scan.nextLine();
		
		Map<String, Integer> checker = new HashMap<>();
		
		for(int i =0; i < name.length(); i ++) {
			char index = name.charAt(i);
			String convert = index + "";
			
//			if(!checker.containsKey(index))   compares on the basis of type
			
			if(!checker.containsKey(convert)) {
				checker.put(convert, 1);
			}
			else
				checker.replace(convert, checker.get(convert)+1);
			
		}
		
		checker.entrySet()
		  .stream()
		  .sorted(Map.Entry.<String, Integer>comparingByKey())
		  .forEach(System.out::println);
		
		
		System.out.println("duplicate numbers are:" + checker);
		
		

	}

}
