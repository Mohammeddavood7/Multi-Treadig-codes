package com.april12.classnotes;


public class PerformanceComparison 
{
	public static void main(String[] args) 
	{
		long startTime = System.currentTimeMillis();  
		
		StringBuilder sb1 = new StringBuilder("Java");
		
		for(int i=1; i<=1000000; i++)
		{
			sb1.append(" Technology");
		}

		long endTime = System.currentTimeMillis();  
		
		System.out.println("Total Time Taken by StringBuilder class is :"+(endTime - startTime));
		
		System.out.println("...............................");
		
         startTime = System.currentTimeMillis();  
		
		StringBuffer sb2 = new StringBuffer("Java");
		
		for(int i=1; i<=1000000; i++)
		{
			sb2.append(" Technology");
		}

		endTime = System.currentTimeMillis();  
		
		System.out.println("Total Time Taken by StringBuffer class is :"+(endTime - startTime));
         
		
		
	}

}

