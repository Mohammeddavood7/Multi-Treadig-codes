package com.april17.MultiThreading;

public class Car implements Runnable
{
    String name;
    String petrolPump;
    
    public Car(String name, String petrolPump)
    {
		super();
		this.name = name;
		this.petrolPump = petrolPump;
	}


	@Override
	public void run() 
	{
		PetrolPump p = new PetrolPump();
		p.refillCar(name);
		
		
	}
	

}































