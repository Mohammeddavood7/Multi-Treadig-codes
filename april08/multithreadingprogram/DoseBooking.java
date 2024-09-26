package com.april08.multithreadingprogram;

public class DoseBooking 
{
	private boolean booked;
	private String name;
	
	public DoseBooking(boolean booked,String name) {
		super();
		this.booked = booked;
		this.name = name;
	}


	public void bookDose() throws DoseBookingException 
	{
		
		
		if(booked == false)
		{
			booked = true;
		}
	 else if(booked == true)
		{
			throw new DoseBookingException("Dose is already booked ");
			
		}
		
	}
	
	
	public void isDoseBooked()
	{
		boolean booking = false;
		if(booked)
		{
			System.out.println("Dose booked successfully for : "+name);
			booked = booking;	
		}
		else 
		{
			System.out.println("dose is not booked: "+name);

		}
	}
	
	

}
























