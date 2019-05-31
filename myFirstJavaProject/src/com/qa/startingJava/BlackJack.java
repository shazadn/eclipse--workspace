package com.qa.startingJava;

public class BlackJack {
	public static void main (String [] args) {
		
		int x = numbers(18, 12);

		System.out.println(x);
	}

	public static int numbers(int numOne, int numTwo) {

		if (numOne > 21 || numTwo > 21) {
			return 0;
		} 
		else if (( numOne <= 21) && (numOne > numTwo))  {
			return numOne;
		}	
		 else {
			 return numTwo;
		 }
		
//		 else if (( numTwo <= 21) && (numTwo > numOne)){
//			return numTwo;
//		}else {
//			return 
//		}
		 

			
	}	 
}
