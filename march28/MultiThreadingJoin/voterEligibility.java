package com.march28.MultiThreadingJoin;

import java.util.function.BiPredicate;

public class voterEligibility 
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		 String name = "scott";
		 int age = 20;
		 boolean isCitizen = true;
		 BiPredicate<Integer,Boolean> bp = (ages,isCitizenn) ->   ages >= 18 && isCitizenn;
		 voterEligibility.checkVoterEligibility(isCitizen, age, bp);
	}
	
	public static void checkVoterEligibility(Boolean isCitizen,int age,BiPredicate<Integer,Boolean> bp	)
	{
		if(bp.test(age,isCitizen))
		{
			System.out.println("the person is eligible to vote.");
		}
		else
		{
			System.out.println("the person is not eligible to vote.");
		}
		
	}

}
