package com.qa.startingJava;

public class App {

	public static void main (String[] args){
		//Bankaccount class
//		Bank bank = new Bank();
//		bank.start();
		
		//UniqueSum class
//		UniqueSum num = new UniqueSum();
//		int total = num.values(9,9,9);
//		System.out.println(total);
		
		//Taxes class 
		Taxes salary = new Taxes();
		salary.taxPercentage(50000);
		System.out.println(salary.taxAmount(50000));
		
		
	}
}
