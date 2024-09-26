package com.april10.StringBufferANDstringBuilder;

public class Test26
{
public static void main(String args[])
	{        
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity()); //16
		
	    StringBuffer sb2 = new StringBuffer("India country");  //21 (16+5)
	   System.out.println(sb2.capacity()); 

        sb2.append("is great. It is in Asia country"); //44  (21*2)+2 = 44
		System.out.println(sb2.capacity()); 	
		
	}
}