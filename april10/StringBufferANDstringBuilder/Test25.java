package com.april10.StringBufferANDstringBuilder;


public class Test25
{
   public static void main(String args[])
	{
		StringBuilder sb1=new StringBuilder("Data"); //mutable
		sb1.append("Base");
		System.out.println(sb1);	

		StringBuffer sb2=new StringBuffer("Data"); //mutable
		sb2.append("Base");
		System.out.println(sb2);	

		String sb3 = new String("Data");  //immutable
	    
	
        System.out.println(sb3);	
	}
}










































