package com.qa.generics;

public class Animal {
	 private int age;
	 
	 public Animal(int age) {
		 this.age = age;
	 }
		
	 public int getAge(){
		 return age;
	 }
	 
	public void die() {
		System.out.println("ugh");
	}
	public void consume() {
		System.out.println("nom nom");
	}
	public void respire() {
		System.out.println("breathe");
	}
	}
