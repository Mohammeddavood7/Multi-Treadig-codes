package com.april12.classnotes;

import java.util.Scanner;
public class StringREVERSE
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String to reverse :");
		String str = sc.nextLine();  
		
        for(int i=str.length()-1; i>=0; i--)  //i =0 
		{
			 System.out.print(str.charAt(i)); 
		}	
        System.out.println();
        sc.close();
	}
}

