package com.march28.test;

@FunctionalInterface
 interface WeatherCondition
 {
    boolean Details(int temperature, boolean isSunny);
}


public class OutdoorActivity 
{
  
    public static void main(String[] args)
    {
    	   int min = 10; 
    	   int max = 30; 
  
        WeatherCondition wc = (int temp, boolean iss) -> temp >= min && temp <= max && iss;
        System.out.println("suitable for outdoor activities:  " +wc.Details(20, true));
        System.out.println("suitable for outdoor activities:  " +wc.Details(25, false)); 

    }
}
