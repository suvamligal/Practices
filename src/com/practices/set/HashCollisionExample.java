package com.practices.set;

public class HashCollisionExample {

	public static void main(String[] args) {
		Integer intObj = new Integer(563332271);
		System.out.println("integer object hashcode is: "  + intObj.hashCode());
		
		
		// two different object having same hashCode also called as hash collision.
		// two objects are not necessarily equal.
		String name = "John Wick";
		System.out.println("String Ojbect hashcode is: " + name.hashCode());
	}
}
