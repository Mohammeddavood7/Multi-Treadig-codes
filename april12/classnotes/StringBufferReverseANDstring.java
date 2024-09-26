package com.april12.classnotes;

import java.util.Scanner;

public class StringBufferReverseANDstring 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("enter string to reverse: ");
	    String input = sc.nextLine();
	    
	    StringBuilder sb = new StringBuilder();
	    sb.append(input);
	    
	    System.out.println(sb.reverse());
	    
	    sc.close();
		
	}
}
