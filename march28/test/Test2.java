package com.march28.test;

import java.util.function.Predicate;

public class Test2 
{
	public static void main(String[] args)
	{
		Predicate<String> p = str ->
		{
			return str.startsWith("a");
		};
		
		boolean test = p.test("mango");
		System.out.println(test);
		
	}

}
