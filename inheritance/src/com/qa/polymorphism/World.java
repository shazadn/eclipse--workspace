package com.qa.polymorphism;

public class World {
  public static void main(String[] args) {
	  Cat cat = new Cat("ill");
	  Cat catty = new Cat("fresh", "fatty");
	  
	  System.out.println(catty.getName());
	  System.out.println(catty.getLook());
	  System.out.println(cat.getName());
	  System.out.println(cat.getLook());
  }
}
