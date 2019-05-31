package com.qa.interfaces;

public class Bees extends Animal implements Fly, See {
	public void bumble() {
		System.out.println("bzzzzzzzz");
	}
	public void flap() {
		System.out.println("*Flaps wings*");
	}
	public void sight() {
		System.out.println("Colour");
	}
	
	public void eyes() {
		System.out.println("Black");
	}

}
