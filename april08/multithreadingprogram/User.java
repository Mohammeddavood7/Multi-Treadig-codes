package com.april08.multithreadingprogram;

public class User 
{
	private String name;
	private int age;
	private boolean healthCondition;
	private static VaccineEligibility eligibility;
	private DoseBooking doseBooking;
	
	
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isHealthCondition() {
		return healthCondition;
	}

	public VaccineEligibility getEligibility() {
		return eligibility;
	}

	public DoseBooking getDoseBooking() {
		return doseBooking;
	}

	public User(String name,int age, boolean healthCondition)
	{
		this.name = name;
		eligibility = new  VaccineEligibility(age, healthCondition);
		this.doseBooking = new DoseBooking(healthCondition,name);
	}

	public void isEligible()
	{
		eligibility.isEligible(name);
	}
	
	
	public void bookDose()
	{
		try 
		{
			doseBooking.bookDose();
			
		} 
		catch (DoseBookingException e)
		{
			System.err.println(e.getMessage());
		}
		
	}
	
	public void isDoseBooked()
	{
		doseBooking.isDoseBooked();
	}

}















































