package com.april12.classnotes;

import java.util.Scanner;

public class RemoveSpecifiedCharacter    
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String :");
    String str = sc.nextLine();  //ravi

	System.out.println("Enter a character you want to remove :");
    char removeChar = sc.next().charAt(0); //v

    StringBuilder result = new StringBuilder(); //rai

    for (char c : str.toCharArray()) // {'r', 'a', 'v', 'i'}
		{
          if (c != removeChar)    //i != v
		  {
             result.append(c);   
          }
       }
    System.out.println(result);
    sc.close();
  }
}
