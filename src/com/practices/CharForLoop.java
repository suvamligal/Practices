package com.practices;

public class CharForLoop {
	public static void main(String[] args) {
		for (char c = 'a'; c < 'e'; ++c) {
			System.out.println("printing " + c);
		}

		System.out.println("###########################");

		for (char c = 'a'; c < 'd'; c++) {
			System.out.println("printing " + c);
		}

		System.out.println("###########################");

		int a =0;
		System.out.println("post increment is \n" + a++);    // \n is escape character.
		System.out.println("pre increment is \n" + ++a);
	}

}
