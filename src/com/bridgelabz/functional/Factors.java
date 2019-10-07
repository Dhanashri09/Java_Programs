package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Factors 
{

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter numbert : ");
		int number=utility.readInteger();
		
		for(int i=2;i<number;i++)
		{
			if(utility.primeFactos(i))
			{
				System.out.println(i+" ");
			}
		}
		System.out.println();
	}

}
