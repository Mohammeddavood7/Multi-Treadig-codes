package com.april16.Strings;

class Outer1
{
	@SuppressWarnings("unused")
	private int x = 18;
	
	class Inner1
	{
		private int y = 88;
	}
	
	public void showInnerPrivateVariable()
	{
		Inner1 in = new Inner1();
		System.out.println("Inner class private variable y: "+in.y);
	}
 
	
}


public class OuterClassAccessInnerPrivateVariable 
{
	public static void main(String[] args) 
	{
		 new Outer1().showInnerPrivateVariable();
		
	}
	

}













