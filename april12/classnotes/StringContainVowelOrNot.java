package com.april12.classnotes;

import java.util.Scanner;

public class StringContainVowelOrNot
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String :");
    String str = sc.nextLine();             //SKY  - sky

    boolean containsVowel = false;

    for (char c : str.toLowerCase().toCharArray())   //{'s','k'..} 
	{
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
	  {
        containsVowel = true;
        break;
      }
    }

    if (containsVowel) 
	{
      System.out.println("The string contains a vowel.");
    } 
	else 
	{
      System.out.println("The string does not contain a vowel.");
    }
    sc.close();
  }
  
}

