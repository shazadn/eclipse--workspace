package com.qa.startingJava;

public class Arrays {
	public static void main (String [] args) {
		
		int [][] x = {
				{4,2,7},
				{4,5,6},
				{7,8,9}};
		
		for(int [] row : x) {
			for(int cell:row) {
				System.out.println(cell);
			}		
		}
		
		}
	}


