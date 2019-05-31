package com.qa.interfaces;

import java.util.ArrayList;

public class Test {
	public static void main (String [] args) {

		// upCasting
//		Animal bee1 = new Bees(); 
		// down Casting
//		Bees bob = (Bees) bee1; 
//		
			
//		Dog dog1 = new Dog();
//		dog1.eyes();
//		Bees bee1 = new Bees();
//		bee1.flap();
//		bee1.eyes();
		 
		
		Dog dog = new Dog();
		Bees b = new Bees();
		
		
		ArrayList<See> sighted = new ArrayList<See>();
		sighted.add(dog);
		sighted.add(b);
		
		sighted.get(1).sight();
		
		
		
	}

}
