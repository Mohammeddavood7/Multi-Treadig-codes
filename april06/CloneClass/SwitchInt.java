package com.april06.CloneClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchInt
{

	public static void main(String[] args) throws IOException
	{
		final String x = "Ravi";
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		  String lines = br.readLine();
		switch(lines)
		{
		case x: System.out.println(x); break;
		
		}
		
	}

}
