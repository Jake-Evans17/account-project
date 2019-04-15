package com.qa.account_application.AccountApplication;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	private static Map<Integer, Account> m1 = new HashMap<Integer, Account>();
	
	public static void addAccount(Account account) {
		m1.put(account.getAccountNumber(), account);
	}
	
	public static Account retrieveAccount(int key) {
		Account account = m1.get(key);
		int accountNumber = account.getAccountNumber();
		String firstName = account.getFirstName();
		String lastName = account.getLastName();
		
		System.out.println("Account Number: " + accountNumber);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		return account;
	}
}