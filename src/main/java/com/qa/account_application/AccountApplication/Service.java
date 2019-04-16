package com.qa.account_application.AccountApplication;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Service {
	
	private static Map<Integer, Account> map1 = new HashMap<Integer, Account>();
    static Gson gson = new Gson();
    static String json = gson.toJson(map1);
	
	public static void addAccount(Account account) {
		map1.put(account.getAccountNumber(), account);
	}
	
	public static Account retrieveAccount(int key) {
		Account account = map1.get(key);
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
        String json = gson.toJson(map1);
        System.out.println("json = " + json);
        return json;
	}
	
	
	public static <T> T getObjectForJSON(String json, Class<T> clazz) {
		Gson gson = new Gson();
		return gson.fromJson(json, clazz);
	}
}