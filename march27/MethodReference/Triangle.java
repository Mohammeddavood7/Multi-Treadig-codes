package com.march27.MethodReference;

public class Triangle 
{
	public static void main(String[] args)
	{
		for(int i = 5 ; i > 0 ; i--)
		{
			for(int j = 0 ; j < 5 - i; j++)
			{
				System.out.print(" ");
			}
			
			for(int k = 0 ; k < 2 * i - 1 ;k++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
