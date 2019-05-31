package com.qa.inheritance;

public class Monkey extends Animal {
	private int weight;
	
	public Monkey(int age, int weight) {
		super(age);
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}

	public int getWeight() {
		return weight;
	}
	public void climb() {
		System.out.println("*climbs*");
	}
}
