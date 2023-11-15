package com.practices.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain implements Comparable<String>{
	
	public static void main(String[] args) {
		List<String> fruits = new ArrayList();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("Orange");
		fruits.add("coconut");
		fruits.add("Guava");
		fruits.add("Tangerine");
		
		Comparator<String> nameCompare = (a,b) -> a.compareTo(b); 
		
		System.out.println("Before Sorting");
		System.out.println(fruits);
		
		fruits.sort(nameCompare);
		System.out.println("nameCompare" + fruits);
		
		Collections.sort(fruits);
		System.out.println("After Sorting");   // look at the sorting on the words that begin with capital vs normal letters.
		
		System.out.println(fruits); 
		
		
	}

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return Integer.compare(this, 0);
	}

}
