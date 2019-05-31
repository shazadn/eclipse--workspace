package com.qa.startingJava;

import java.util.ArrayList;
import java.util.Scanner;

public class UserListTask {

	//private static final String True = null;

	public static void main (String [] args) {
		
		String output;
		//String array = shopList();
		System.out.println("What would you like to do ?");
		
		//System.out.println(input());
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		boolean cont = true;
		while(cont){
			
			String response = input();
		if (response.equals("add")){
			System.out.println("What would you like to add ?");
			list.add(input());
			System.out.println(input() + " has been added");
		}
		else if (response.equals("show")) {
			System.out.println("The list : ");
			output = list.get(Integer.parseInt(input()));
			System.out.println(output);
	}
		else if (response.equals("delete")) {
			list.remove(response);
		}
		else if (response.equals("exit")) {
			cont = false;
		}
		else
		{
			
		}
		}
	}

	public static String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}


}
