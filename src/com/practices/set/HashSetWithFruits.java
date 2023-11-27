package com.practices.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetWithFruits {
	
	public static void main(String[] args) {
		Set<Fruits> foodBank = new LinkedHashSet<Fruits>();      //LinkedHashSet maintains order. 
		
		Fruits fruit1 = new Fruits(1,"berries", "Blue");
		Fruits fruit2 = new Fruits(2,"apple", "red");      // same as fruit4. Content same. Override hashCode() and equals method().
		Fruits fruit3 = new Fruits(3,"mango", "yellow");
		Fruits fruit4 = new Fruits(2,"apple", "red");
		Fruits fruit5 = new Fruits(5,"guava", "green");
		
		foodBank.add(fruit1);
		foodBank.add(fruit2);
		foodBank.add(fruit3);
		foodBank.add(fruit4);
		foodBank.add(fruit5);
		
		System.out.println("hashcode of fruit2 is " + fruit2.hashCode());
		System.out.println("hashCode of fruit4 is " + fruit4.hashCode());
		
		
		System.out.println("#######################################################");
		for(Fruits store : foodBank) {
			System.out.println(store);       
		}
		
		System.out.println("foodBank contains fruit4: " + foodBank.contains(fruit4));
	}

}
