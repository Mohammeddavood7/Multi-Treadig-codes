package com.april10.StringBufferANDstringBuilder;

public class StringBufferClass
{
	
	public static void main(String args[])
	{
		String s1="Hyderabad is a nice city";  
		String [] words = s1.split(" "); //Space is Delimiter
//			for(String word : words)
//			{
//				System.out.println(word);
//			}       
//		    System.out.println("..............");

	        String s2="Hyderabad is a nice city";  
			words = s2.split("a"); 

			for(String word : words)
			{
				System.out.println(word);
			} 
		
	}  


}
