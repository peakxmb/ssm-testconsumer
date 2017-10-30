package org.lzsf.movie.controller;

import java.util.List;

import javax.annotation.Resource;

import org.lzsf.movie.po.Movie;
import org.lzsf.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/findMovieList")
	public List<Movie> findMovieList(){
		List<Movie> findMovieList = movieService.findMovieList();
		return findMovieList;
	}
}
