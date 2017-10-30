package org.lzsf.movie.service;

import java.util.List;

import org.lzsf.movie.po.Movie;

public interface MovieService {

	List<Movie> findMovieList();
	
}
