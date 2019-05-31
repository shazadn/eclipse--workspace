package com.qa.garage;

import java.util.ArrayList;
import java.util.Scanner;


public class Garage {
	public static void main (String [] args) {
		
	
			ArrayList<Vehicle> list = new ArrayList<Vehicle>();

			Vehicle vec1 = new Car(false, "Vauxhall", "White", 4);
			Vehicle vec2 = new Car(true, "VW", "Grey", 4);
			Vehicle vec3 = new Car(true, "Hyundai", "Blue", 4);
			
			list.add(vec1);
			list.add(vec2);
			list.add(vec3);
			
			
			for ( int i = 0; i < list.size(); i++) {
				Vehicle v = list.get(i);
				
			if(v.getClass().getSimpleName().equals("Car")) {
				System.out.println("Car");
			}
			}
			
	       //System.out.println(list.get(2).getName());
		
		}	
	}

