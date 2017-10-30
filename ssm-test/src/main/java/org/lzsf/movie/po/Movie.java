package org.lzsf.movie.po;

import java.io.Serializable;

public class Movie implements Serializable{

	/**
	 * 序列化接口
	 */
	private static final long serialVersionUID = -5119207651979126704L;
	/*电影Id*/
	private int movieId;
	/*电影名称*/
	private String movieName;
	/*上映日期*/
	private String movieDate;
	/*电影票价格*/
	private double movieMoney;
	/*电影类型*/
	private int typeId;
	
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDate() {
		return movieDate;
	}
	public void setMovieDate(String movieDate) {
		this.movieDate = movieDate;
	}
	public double getMovieMoney() {
		return movieMoney;
	}
	public void setMovieMoney(double movieMoney) {
		this.movieMoney = movieMoney;
	}
	
	
}
