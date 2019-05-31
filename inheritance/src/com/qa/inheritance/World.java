package com.qa.inheritance;

import java.util.ArrayList;

public class World {
	public static void main(String [] args) {
		//Fish fish = new Fish();
//		fish.die();
//		fish.swim();
		
//		Animal fish = new Fish();
//		Animal monkey = new Monkey();
//		Fish fishy = (Fish) fish;
//		
//		ArrayList<Animal> list = new ArrayList<Animal>();
//		list.add(fish);
//		list.add(monkey);
//		list.add(fishy);
//		((Fish)list.get(2)).swim();
		
		Fish fish = new Fish(4,6);
		fish.getAge();
		fish.getFins();
		System.out.println(fish.getClass().getSimpleName());
		System.out.println(fish.getFins());
		Monkey monkey = new Monkey(7, 50);
		System.out.println(monkey.getWeight());
	
	}
}
 