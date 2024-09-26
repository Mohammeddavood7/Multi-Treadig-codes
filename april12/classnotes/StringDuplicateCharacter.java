package com.april12.classnotes;

import java.util.Scanner;

public class StringDuplicateCharacter 
{
	public static void main(String ...x)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a String :");
	  String str = sc.nextLine(); //ravishankar
	
	  int count = 0;
	  char[] arr = str.toCharArray();  //{'r','a'....} 
	
	  System.out.println("Duplicate Characters are:");
	
		  for (int i = 0; i < str.length(); i++)     //i=1   length = 11
		  {
		    for (int j = i + 1; j < str.length(); j++) //j = 2  length = 11
			{
		      if (arr[i] == arr[j])   //
				  {
		             System.out.println(arr[j]);  //r  a  a
		             count++;                     //count = 3
		             break;
		          }
		     }
		  }
	   System.out.println("Total duplicate characters are :"+count);
	   sc.close();
	 }
}






