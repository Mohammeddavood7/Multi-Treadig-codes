package com.april06.CloneClass;


public class StringGCEligibility 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String str1 = "India";
		System.out.println(str1.hashCode());
		
		str1 = null;
		
		System.gc();
		
		Thread.sleep(2000);
		
		String str2 = "India";
		System.out.println(str2.hashCode());
		
		System.out.println("...........");
		System.out.println(str1);
		System.out.println(str2);
	}
}