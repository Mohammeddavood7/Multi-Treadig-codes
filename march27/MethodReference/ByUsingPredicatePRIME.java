package com.march27.MethodReference;

import java.util.function.Predicate;

public class ByUsingPredicatePRIME
{
	public static void main(String[] args)
	{
		Predicate<Integer> isPrime = num ->
		{
			boolean prime  = true;
			if(num <= 1)
			{
				prime = false;
				
			}
			
			for(int i = 2; i <= Math.sqrt(num); i++)
			{
				if( num % i == 0)
				{
					prime = false;
				}
				
			}
			return prime;
			
		};
		
		
		boolean test = isPrime.test(2);

		
		if(test)
		{
			System.out.println("It is prime number");
		}
		else
		{
			System.out.println("It is not prime number");
		}
		
	}

}
