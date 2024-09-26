package com.march28.MultiThreadingJoin;

@FunctionalInterface
interface WeatherConditionEvaluator 
{
	
	boolean isSuitableForOutdoorActivities(int temp,boolean isSunny);

}

public class outdoorActivity
{
	public static void main(String[] args) 
	{
		int min = 20;
		int max = 30;
		
		WeatherConditionEvaluator wce = (temp,sun) -> temp >=  min && temp <= max && sun; 
		boolean suitable = wce.isSuitableForOutdoorActivities(20, true);
		
		if(suitable)
		{
			System.out.println("it is suitable for outdoor activities");
		}
		else {
			System.out.println("it is not suitable for outdoor activities");

		}
		
	}
}

