package com.qa.account_application.AccountApplication;

import java.util.Map;

public class App 
{
    public static void main( String[] args )
    {        
        Account acc1 = new Account("Billy", "Bill", 123456);   
        Service.addAccount(acc1);        
        Service.retrieveAccount(123456);
        
        String json = Service.mapToJson();
        System.out.println(Service.getObjectForJSON(json, Map.class));
    }
}
