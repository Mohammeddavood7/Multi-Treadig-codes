package com.april16.Strings;

class Outer5
{
	private static String name = "NareshIT";
	
	static class Inner5
	{
		public static void display()
		{
			System.out.println("Name of the Institute: "+name);
		}
	}
}



public class StaticInnerClass
{
	public static void main(String[] args)
	{
		//Outer5.Inner5 in = new Outer5.Inner5();
		
		Outer5.Inner5.display();
		
	}

}





























