package com.qa.garage;

public class Car extends Vehicle {
private boolean aux;

public Car( boolean aux, String name, String colour, int wheels) {
	super(name,colour, wheels);
	this.aux = aux;
}

@Override
public String getName() {
	// TODO Auto-generated method stub
	return name;
}

@Override
public String getColour() {
	// TODO Auto-generated method stub
	return colour;
}

@Override
public int getWheels() {
	// TODO Auto-generated method stub
	return wheels;
}

	
}
