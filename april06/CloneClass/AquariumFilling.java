package com.april06.CloneClass;

class Aquarium 
{
	int capacity;
	int currentVolume;
	
	public Aquarium()
	{
		this.currentVolume = 0;
		this.capacity = 100;
	}
	
	public synchronized void fill(int amount)
	{
		String name = null;
		 name = Thread.currentThread().getName();
		if(currentVolume + amount < capacity)
		{
			
			currentVolume += amount;
			System.out.println("Name of the thread: "+name+", Current Volume: "+amount);
		}
		else
		{
			System.err.println("Name of the thread: "+name+", available capacity Current Volume: "+(capacity-amount)+", not valiable this amount capacity: "+amount);
		}
		System.out.println("Finished aqurium amount: "+currentVolume);
		
	}

}

class FillingThread implements Runnable
{
	Aquarium aquarium;
	int amount;
	
	public FillingThread(Aquarium aquarium,int amount)
	{
		this.aquarium= aquarium;
		this.amount = amount;
		
	}
	@Override
	public void run()
	{
		aquarium.fill(amount);
	}
	
}

public class AquariumFilling
{
	public static void main(String[] args) 
	{
		Aquarium aquarium = new Aquarium();
		FillingThread ft1 = new FillingThread(aquarium, 50);
		FillingThread ft2 = new FillingThread(aquarium, 48);

		
		Thread thread1 = new Thread(ft1);
		thread1.start();
		Thread thread2 = new Thread(ft2);
		thread2.start();
		
	}
}














































