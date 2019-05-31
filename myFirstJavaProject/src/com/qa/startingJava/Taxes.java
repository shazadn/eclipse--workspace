package com.qa.startingJava;

public class Taxes {
	
	public void taxPercentage(float salary) {
		
		if (salary >= 44999) {
			System.out.println("Percentage to be taxed: 25% ");
		}
		else if (salary >= 29999) {
			System.out.println("Percentage to be taxed: 20% ");
		}
		else if (salary >= 19999 ) {
			System.out.println("Percentage to be taxed: 15% ");
		}
		else if (salary >= 15000) {
			System.out.println("Percentage to be taxed: 10% ");
		}
		else {
			System.out.println("Percentage to be taxed: 0% ");
		}
	}
	
	public float taxAmount(float salary) {
		
		if (salary >= 44999) {
			return salary * 0.25F;
		}
		else if (salary >= 29999) {
			return salary * 0.2F;
		}
		else if (salary >= 19999 ) {
			return salary * 015F;
		}
		else if (salary >= 15000) {
			return salary * 0.1F;
		}
		else {
			return salary;
		}
		
		
		
		
		
		
	}
	
}
