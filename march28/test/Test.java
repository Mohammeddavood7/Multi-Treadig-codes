package com.march28.test;

import java.util.function.BiFunction;

public class Test
{
	public static void main(String[] args)
	{
		BiFunction<Integer,Integer , Integer> bf = (l,b) ->
		{
			int res = l * b ;
			return res;
		};
		
		System.out.println("Area of the rectangle: "+bf.apply(3, 3)); 
		
	}

}
