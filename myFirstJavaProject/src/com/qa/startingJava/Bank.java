package com.qa.startingJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	
	public  void start () {
		boolean cont = true;
	
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		
		while(cont)
		{
			System.out.println("Welcome, choose from 'add', 'delete' & 'show'");
			String response = input();
			
			if(response.equals("add"))
			{
				System.out.println("Add new user");
				BankAccount newAcc = new BankAccount(input(), 0F);
				accounts.add(newAcc);
				
				
				System.out.println("Add balance");
				String balance = input();
				newAcc.balance = Float.parseFloat(balance);
				
		
			}
			else if(response.equals("show"))
			{
				System.out.println("Show balance, of which account?");
				String sName = input();
				for (BankAccount acc:accounts)
				{
					if(sName.equals(acc.name))
					{
						System.out.println(acc.balance);
					}
				}
			}
			else if(response.equals("delete")) {
				System.out.println("Delete which account?");
				String sName = input();
				for (int index = 0; index < accounts.size(); index++) {
						if(accounts.get(index).name.equals(sName)) {
							accounts.remove(index);
							System.out.println("Account successfuly deleted");
							break;
						}
						else if(accounts.get(index).name != (sName))
							System.out.println("There is not an account of that name");
						}
						
					}
				}
			}
		
	

	public  String input() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		return input;
	}
}
