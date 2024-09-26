package com.april15.classnotespractice;

public class StringSwap
{
	public static void main(String[] args)
	{
		String s = "ravi shankaR";
		
		System.out.println("original name: "+s);
		char[] ch = s.toCharArray();
		char end = ch[ch.length-1];
		char start = ch[0];
		ch[ch.length-1] = start;
		ch[0] = end;
		
		System.out.print("change name: ");
		for(char c : ch)
		{
			System.out.print(c);
		}
		 
		
	}

}
