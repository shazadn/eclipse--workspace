package com.qa.repository;

import java.util.List;

import com.qa.model.Account;

public interface AccountRepo {
	//C
	public Account createAccount(Account account);
	//R
	public Account getAccount(int id);
		
	
	public List<Account> getAccounts();
	
	//U
	public Account updateName(int id, String newName);
	
	//D
	public void deleteAcccount(int id);
}
