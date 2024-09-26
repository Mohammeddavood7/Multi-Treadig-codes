package com.april17.MultiThreading;

public class PetrolPump 
{
	int count;
	public synchronized void refillCar(String carName)
	{
		System.out.println(carName+" car is started and completes refilling");
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
