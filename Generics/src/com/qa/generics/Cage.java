package com.qa.generics;

public class Cage<T extends Animal> {
	private T myItem;
	
	
	public T getItem() {
		return this.myItem;
	}
	
	public void setItem(T input) {
		this.myItem = input;
	}


public static void main ( String [] args) {
	//Cage<Animal> myCage = new Cage<Animal>();
	Cage<Animal> myCage = new Cage<Animal>();
	Cage<Animal> myCage2 = new Cage<Animal>();
	


}
}
