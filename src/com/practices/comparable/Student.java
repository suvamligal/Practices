package com.practices.comparable;

public class Student implements Comparable<Student>{
	private int sid;
	private String name;
	private int rollNo;
	private String grade;

	public Student(int sid, String name, int rollNo, String grade) {
		super();
		this.sid = sid;
		this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", rollNo=" + rollNo + ", grade=" + grade + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.rollNo - o.rollNo;
	}

}
