package com.practices.comparator;

import java.util.Comparator;

public class SortMovieByRatings implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getRatings() < o2.getRatings()) {
			return 1;
		}else if (o1.getRatings() > o2.getRatings()) {
			return -1;
		}else
			return 0;
	
	}

}
