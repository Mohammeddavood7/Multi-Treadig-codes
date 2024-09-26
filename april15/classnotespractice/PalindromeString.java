package com.april15.classnotespractice;

public class PalindromeString
{
	public static void main(String[] args)
	{
		    String s = "deified";
		 
		    boolean p = true;
		                         //6/2 = 3 => 0,1,2             
			for(int i = 0 ; i < s.length()/2 ; i++)
			{
				//3 != 3 // m != m
				if(s.charAt(i) != s.charAt(s.length() - 1 - i))
				{
					
					  p = false;
				}
			}
			
			if(p)
			{
				System.out.println("its a palidrome");
			}
			else
			{
				System.out.println("its not palidrome");
			}
			
			
		
	}
}













































