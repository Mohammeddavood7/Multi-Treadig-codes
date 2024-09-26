package com.april15.classnotespractice;

public class Occurance
{
	public static void main(String[] args)
	{
		            
		String str = "ravishankar"; 
		char[] ch = str.toCharArray();
		String removeOccurance="";
		         
		for(int i = 0 ; i < str.length() ; i++)
		{
			char hold = ch[i];
			
			if(hold == '*')continue;
			
			for(int j = i+1 ; j < str.length() ; j++)
			{
				if(hold == ch[j]) ch[j] = '*';
			}
			removeOccurance += hold;
		}	
		System.out.println(removeOccurance);
	}

}



































