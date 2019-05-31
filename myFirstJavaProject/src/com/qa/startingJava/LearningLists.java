package com.qa.startingJava;

import java.util.ArrayList;

public class LearningLists {
	public static void main (String [] args) {
		
		ArrayList<String> shopList = new ArrayList<String>();
		
		shopList.add("cheese");
		shopList.add("trams");
		shopList.add("dogs");
		System.out.println(shopList.get(1));
		shopList.remove(1);
		System.out.println(shopList.get(1));
		
		
		
	}
}
