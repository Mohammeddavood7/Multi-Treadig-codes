package com.april15.string;

public class PalindromeString
{
	public static void main(String[] args)
	{
		String word = "racecar";
		            // 01234
		
		char[] ch = word.toCharArray();
		 boolean palidrome = true;
		 
		for(int i = 0 ; i < word.length()/2 ; i++)
		{
			if(ch[i] != word.charAt(word.length() - 1 - i) )
			{
				palidrome = false;
			}
			
		}
		
		if(palidrome)
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
	}

}
