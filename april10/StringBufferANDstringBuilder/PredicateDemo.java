package com.april10.StringBufferANDstringBuilder;

import java.util.StringTokenizer;

public class PredicateDemo {

	public static void main(String[] args) 
	{		
		String str = "Hyderabad is an IT city";
		
        StringTokenizer st = new StringTokenizer(str, "i");
        StringTokenizer st1 = new StringTokenizer(str,"a");
        st1.countTokens();
        st1.hasMoreTokens();
        st1.nextToken();
        System.out.println("Total number of tokens :"+st.countTokens());
        System.out.println("Tokens are :");
        
//        while(st.hasMoreTokens())
//        {

        	System.out.println(st.nextToken());        	
        //}


	}

}
	