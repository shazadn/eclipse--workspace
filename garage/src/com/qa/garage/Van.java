package com.qa.garage;

public class Van extends Vehicle {
	private String size;
	
public Van(String size, String name, String colour, int wheels) {
	super(name, colour, wheels);
	this.size = size;
}

public String getSize() {
	return size;
}

@Override
public String getName() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getColour() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int getWheels() {
	// TODO Auto-generated method stub
	return 0;
}
}
