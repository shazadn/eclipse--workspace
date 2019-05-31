package com.qa.hashMaps;

import java.util.HashMap;

public class HashMaps { 
	public static void main (String[] args) {
//		HashMap<String, String> myMap = new HashMap<String, String>();
//		String s = "A bird has wings";
//		myMap.put("Bird", s);
//		System.out.println(myMap.get("Bird"));
//		
		
		HashMap<Integer, Nurse> myMap = new HashMap<Integer, Nurse>();
		Nurse s = new Nurse("Chris");
		myMap.put(5, s);
		System.out.println(myMap.get(5).getName()             );
	}
}
