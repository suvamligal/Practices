package com.practices.comparator;

public class Movie {
	private int movId;
	private String name;
	private int year;
	private double ratings;
	
	public Movie(int movId, String name, int year, double ratings) {
		super();
		this.movId = movId;
		this.name = name;
		this.year = year;
		this.ratings = ratings;
	}

	public int getMovId() {
		return movId;
	}

	public void setMovId(int movId) {
		this.movId = movId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Movie [movId=" + movId + ", name=" + name + ", year=" + year + ", ratings=" + ratings + "]";
	}
	
}
