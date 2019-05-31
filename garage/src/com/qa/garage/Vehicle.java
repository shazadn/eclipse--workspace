package com.qa.garage;

public abstract class Vehicle {
	protected String name;
	protected String colour;
	protected int wheels;

	public Vehicle(String name, String colour, int wheels){
		this.name = name;
		this.colour = colour;
		this.wheels = wheels;
	}
	
	public abstract String getName();
		
	
	public abstract String getColour();
		
	
	public abstract int getWheels();
		
	}
