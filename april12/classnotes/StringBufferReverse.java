package com.april12.classnotes;

public class StringBufferReverse
{
	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer("Hello");
		 
		for(int i = sb1.length()-1 ; i >= 0 ; i--)
		{
			System.out.print(sb1.charAt(i));
		}
		System.out.println();
		StringBuffer sb2 = new StringBuffer("New York");
		System.out.println(sb2.reverse());
		
		StringBuilder sb3 = new StringBuilder("New York");
		System.out.println(sb3.reverse());
	}
}
