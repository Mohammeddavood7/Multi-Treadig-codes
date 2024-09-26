package com.march28.test;

import java.util.function.BiPredicate;

public class VoterEligibility 
{
    @SuppressWarnings("unused")
	public static void main(String[] args)
    {
        String name = "John";
        int age = 20;
        boolean isCitizen = true;

        BiPredicate<Integer, Boolean> eligibilityCheck = (personAge, citizenship) -> personAge >= 18 && citizenship;

        checkVoterEligibility(age, isCitizen, eligibilityCheck);
      
    }

    public static void checkVoterEligibility(int age, boolean isCitizen, BiPredicate<Integer, Boolean> eligibilityCheck)
    {
        if (eligibilityCheck.test(age, isCitizen)) 
        {
            System.out.println("The person is eligible to vote.");
        } 
        else 
        {
            System.out.println("The person is not eligible to vote.");
        }
    }
}
