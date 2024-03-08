package com.practices.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	// keys cannot be duplicate. Value can be duplicate
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "Mango");
		map.put(102, "Orange");
		map.put(103, "Apple");
		map.put(104, "Guava");
		map.put(105, "Pineapple");
		map.put(103, "replaced apple"); // will replace the value in key 103 from "apple" to "replaced apple". 
										// keys will be unique but value will be updated.
		System.out.println(map);

		System.out.println(map.containsKey(101));
		System.out.println(map.containsValue("Orange"));

		System.out.println(map.isEmpty());

		System.out.println(map.keySet()); // returns all keys as a set.

		System.out.println(map.values()); // returns all values as collection.

		System.out.println(map.entrySet()); // returns all entries as a set.

		for (int i : map.keySet()) {
			System.out.println(i); // returns Key as a value instead of a Set Data type.
		}

		System.out.println("############### By Using Hashmap Methods ##############");
		for (Object i : map.keySet()) {
			System.out.println(i + " " + map.get(i));
		}

		System.out.println("########## By Using Entry interface ######################");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Entry set Keys are " + entry.getKey());
			System.out.println("Entry set values are " + entry.getValue());
		}

		System.out.println("############ By Using Iterator ####################");
		Set s = map.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println("Entry set Keys are " + entry.getKey());
			System.out.println("Entry set values are " + entry.getValue());
		}

	}

}
