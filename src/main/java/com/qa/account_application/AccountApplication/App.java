package com.qa.account_application.AccountApplication;

public class App 
{
    public static void main( String[] args )
    {        
        Account acc1 = new Account("Billy", "Bill", 123456);   
        Service.addAccount(acc1);        
        Service.retrieveAccount(123456);
        
    }
}
