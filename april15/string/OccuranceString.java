package com.april15.string;

public class OccuranceString 
{
	public static void main(String[] args)
	{
		String s = new String("ravishankar");
		String str="";
		char[] ca = s.toCharArray();
		
		for(int i=0;i<ca.length;i++)
		{
			char hold=ca[i];
			if(hold=='*')continue;
			
			for(int j=0;j<ca.length;j++)
			{
				if(hold==ca[j])
				{
					ca[j]  = '*' ;
				}
			}
			//System.out.print(hold);
			str+=hold;
		}
		System.out.println(str);
		
		
	}

}
