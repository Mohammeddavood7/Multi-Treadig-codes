package com.april10.StringBufferANDstringBuilder;

public class Test24
{
   public static void main(String args[])
	{
		String str = "ABCDEF";	
		
		byte [] b = str.getBytes();

		for(byte a : b)
		{
			System.out.println((char)a);  
		}
	}
}         
