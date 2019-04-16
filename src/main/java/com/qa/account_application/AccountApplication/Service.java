package com.qa.account_application.AccountApplication;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class Service {
	
	private static Map<Integer, Account> map1 = new HashMap<Integer, Account>();
    static Gson gson = new Gson();
    static String json = gson.toJson(getMap1());
	
	public static Map<Integer, Account> getMap1() {
		return map1;
	}

	public static void setMap1(Map<Integer, Account> map1) {
		Service.map1 = map1;
	}
    
	public static void addAccount(Account account) {
		getMap1().put(account.getAccountNumber(), account);
	}
	
	public static Account retrieveAccount(int key) {
		Account account = getMap1().get(key);
		int accountNumber = account.getAccountNumber();
		String firstName = account.getFirstName();
		String lastName = account.getLastName();
		
		System.out.println("Account Number: " + accountNumber);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		return account;
	}
	
	public static String mapToJson() {
        Gson gson = new Gson();
        String json = gson.toJson(getMap1());
        System.out.println("json = " + json);
        return json;
	}
	
	public static <T> T getObjectForJSON(String json, Class<T> clazz) {
		Gson gson = new Gson();
		return gson.fromJson(json, clazz);
	}

	public static int countFirstName(String name) {
		for (int key : map1.keySet()) {
			if (map1.get(key).getFirstName().equals(name)) {
				return 1;
			}
		}
		return 0;
	}


}