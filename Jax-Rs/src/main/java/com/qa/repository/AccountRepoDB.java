package com.qa.repository;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import com.qa.model.Account;


public class AccountRepoDB implements AccountRepo {
	
	
	@PersistenceUnit (unitName = "myPU")
	private EntityManagerFactory emf;
			
	
	public Account createAccount(Account account) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction et = manager.getTransaction();
		et.begin();
		manager.persist(account);
		et.commit();
		manager.close();
		return account;
	}


	@Override
	public Account getAccount(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Account> getAccounts() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Account updateName(int id, String newName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteAcccount(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
