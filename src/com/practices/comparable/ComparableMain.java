package com.practices.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain{

	public static void main(String[] args) {
		Student std1 = new Student(1, "mike", 33, "seven");
		Student std2 = new Student(2, "sam", 22, "twelve");
		Student std3 = new Student(3, "angel", 21, "nine");
		Student std4 = new Student(4, "tam", 44, "eleven");
		Student std5 = new Student(5, "george", 45, "eleven");
		
		List<Student> students = new ArrayList<>();
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(std4);
		students.add(std5);
		
		System.out.println("Before Sorting" + students);
		Collections.sort(students);
		System.out.println("After Sorting" + students);
		
		
	}
	

}
