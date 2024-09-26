package com.april12.classnotes;

//public StringBuffer insert(int position, String str)
//Based on the index position we can insert the String
public class StringBufferInsert
{
	   public static void main(String args[])
		{	
			StringBuffer sb = new StringBuffer("hello");
			sb.insert(3, "Ravi");
			
			System.out.println(sb);
			
			StringBuilder sbr = new StringBuilder("Scott");
			sbr.insert(2, "Miller");
		  System.out.println(sbr);
		}
}














