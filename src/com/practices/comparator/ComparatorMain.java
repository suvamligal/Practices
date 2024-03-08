package com.practices.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {
	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie(1,"jam",1996,7.8));
		movies.add(new Movie(5,"Gone with the wind",1997,9.2));
		movies.add(new Movie(1,"Crash",1999,5.6));
		movies.add(new Movie(3,"John wick",2000,9.5));
		movies.add(new Movie(4,"Mike",2023,8.7));
		
		System.out.println("Before Sorting:");
		for (Movie movie : movies) {
			System.out.println(movie.getRatings());
		}
		
		Collections.sort(movies, new SortMovieByRatings());
		System.out.println("After Sorting:");
		for (Movie movie : movies) {
			System.out.println(movie.getRatings());
		}
	}

}
