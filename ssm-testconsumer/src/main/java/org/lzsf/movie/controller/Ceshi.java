package org.lzsf.movie.controller;

public class Ceshi {

	public static void main(String[] args) {
		int cap,bottle,sum;//cap瓶盖个数 ，bottle 空瓶个数，sum统计；
		cap = bottle = sum = 30; //未兑换前个数
		while(cap > 5 || bottle > 3) {
		sum = sum + cap / 5;  //用盖子兑换  6
		sum = sum + bottle / 3;   //用空瓶子兑换  10 
		cap = cap / 5 + cap % 5;
		bottle = bottle / 3 + bottle % 3;
		}
		System.out.println("总共喝了 " + sum + " 瓶酒");
		System.out.println("剩下  " + cap + " 个盖子和  " + bottle + " 个空瓶");
	}
}
