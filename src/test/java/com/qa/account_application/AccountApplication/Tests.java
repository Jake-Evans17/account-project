package com.qa.account_application.AccountApplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Tests {
	
	@BeforeClass
	public static void createAndAddAccounts() {
        Account acc1 = new Account("John", "Smith", 123456);   
        Account acc2 = new Account("Bill", "Brent", 234567);   
        Account acc3 = new Account("Tina", "Jones", 345678);   
        Account acc4 = new Account("Sally", "Davis", 456789);   
        Account acc5 = new Account("Bill", "West", 567890);   
        Service.addAccount(acc1);
        Service.addAccount(acc2);
        Service.addAccount(acc3);
        Service.addAccount(acc4);
        Service.addAccount(acc5);
	}
	
	@Test
	public void test1() {
		assertEquals("Actual was not expected", 1, Service.countFirstName("John"));
	}
	
	@Test
	public void test2() {
		assertEquals("Actual was not expected", 0, Service.countFirstName("Debra"));
	}
	
	@Test
	public void test3() {
		assertEquals("Actual was not expected", 2, Service.countFirstName("Bill"));
	}
	
	@Test
	public void test4() {
		assertEquals("Actual was not expected", "There are 2 accounts with the first name Bill", Service.countFirstName("Bill"));
	}
	
	@AfterClass
	public static void emptyMap() {
		Service.getMap1().clear();
	}
}
