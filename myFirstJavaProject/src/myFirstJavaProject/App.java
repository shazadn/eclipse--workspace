package myFirstJavaProject;

public class App {
	public static void main (String[] args){
		System.out.println(multiply(3,5));
	}
	
	public static int multiply (int numOne, int numTwo){
		int total = numOne * numTwo;
		return total;
	}
}
