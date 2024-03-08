package com.practices.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListPractice {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("Apple");
		lista.add("Mango");
		lista.add("Banana");
		lista.add("Guava");
		lista.add("Lichi");
		lista.add("Strawberry");
		lista.add("Grapes");
		lista.add("Dragonfruit");
		lista.add("Orange");
		lista.add("Pear");      // initial capacity of arraylist = 10; 
		lista.add("Apple");     // new capacity = 16
		lista.add("Lichi");
		lista.add("Grapes");
		lista.add("Berries");
		lista.add("Papaya");
		
		System.out.println("size of arraylist is " + lista.size());  // number of elements in arraylist = size()
		System.out.println(lista.hashCode());
		System.out.println("################################################");
		
		//iterating using forEach. forEach introduced in jdk 5.
		for(String fruits: lista) {
			String fruit = fruits;
			System.out.println(fruit);
		}
		
		System.out.println("################################################");
		
		//iterating using iterator
		Iterator<String> fruitsb = lista.iterator();
		while(fruitsb.hasNext()) {
			String fruitb = fruitsb.next();
			System.out.println(fruitb);
		}
		
		System.out.println("################################################");
		Set<String> listSet = new HashSet<String>();
		listSet.add("Apple");
		listSet.add("Mango");
		listSet.add("Banana");
		listSet.add("Apple");
		listSet.add("Lichi");
		listSet.add("Apple");
		
		System.out.println("size of set is " + listSet.size());  // number of elements in set = size()
		System.out.println(listSet.hashCode());
		System.out.println("################################################");
		
		//iterating using iterator
		Iterator<String> setFruits = listSet.iterator();
		while(setFruits.hasNext()) {
			String setfb = setFruits.next();
			System.out.println(setfb);     // duplicate elements are not printed.
		}
		
		
	}

}
