package com.qa.startingJava;

public class UniqueSum {
//	public static void main (String [] args) {
//		int total = values(9,9,9);
//		
//		System.out.println(total);
//	}
	
	public int values (int numOne, int numTwo, int numThree) {
		
		if (numOne == numTwo){
			return numThree;
		}
		else if (numOne == numThree) {
			return numTwo;
		}
		
		if (numTwo == numOne) {
			return numThree;
		}
		else if (numTwo == numThree) {
			return numOne;
		}
		
		if (numThree == numOne) {
			return numTwo;
		}
		else if (numThree == numTwo) {
			return numOne;
		}
		
		return numOne + numTwo + numThree;
		
	}

}
