package org.lzsf.movie.service;

import java.util.List;

import org.lzsf.movie.mapper.MovieMapper;
import org.lzsf.movie.po.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieMapper movieMapper;

	public List<Movie> findMovieList() {
		return movieMapper.findMovieList();
	}
	
}
