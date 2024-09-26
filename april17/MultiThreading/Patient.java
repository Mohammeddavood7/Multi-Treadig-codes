package com.april17.MultiThreading;

public class Patient implements Runnable
{
	private int patientId;
	int p ;

	public Patient(int patientId)
	{
		super();
		this.patientId = patientId;
	}
	
	

	public int getPatientId() {
		return patientId;
	}
	
	public static synchronized void patientWait(int p)
	{
		
		System.out.println("Patient "+(p++)+ " has been treated and is leaving."
				+ "");
		
	}
	
	@Override
	public synchronized void run() 
	{
		System.out.println("Patient "+ patientId + " has arrived at the hospital."+ "");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(Patient.class)
		{
		   patientWait(patientId);
		}
		
		
	}
	
	
}


























































































