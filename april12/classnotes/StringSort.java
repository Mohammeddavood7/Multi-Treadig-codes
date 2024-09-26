package com.april12.classnotes;

import java.util.Scanner;
public class StringSort
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String :");
    String str = sc.nextLine();  //mango

    char[] chars = str.toCharArray();    

    for (int i = 0; i < chars.length; i++)   
	{
      for (int j = i + 1; j < chars.length; j++)  
	  {
        if (chars[i] > chars[j])   
		{
          char temp = chars[i];
          chars[i] = chars[j];
          chars[j] = temp;
        }
      }
    }
    System.out.println(new String(chars));
    
    sc.close();
  }
}
