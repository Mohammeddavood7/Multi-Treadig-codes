package com.april08.multithreadingprogram;

public class VaccineEligibility
{
	private int age;
	private boolean hasHealthCondition;
	
	
	
	public VaccineEligibility(int age, boolean hasHealthCondition) {
		super();
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	}

	@Override
	public String toString() {
		return "VaccineEligibility [age=" + age + ", hasHealthCondition=" + hasHealthCondition + "]";
	}
	
	public boolean isEligible(String name)
	{
		if(((age >= 18 && age <= 60)) && (hasHealthCondition == false))
		{
			System.out.println(name+" is eligible for vaccination.");
		   return true;
		}
		else
		{
			System.out.println(name+" is not eligible for vaccination."); 
			   return false;

		}
	}

}
