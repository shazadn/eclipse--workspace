package com.qa.interfaces;

public class Dog extends Animal implements See {
	public void bork() {
		System.out.println("Bork Bork");
	}
	
	public void sight() {
		System.out.println("Black & White");
	}
	
	public void eyes() {
		System.out.println("Puppy Eyes");
	}

	
}
