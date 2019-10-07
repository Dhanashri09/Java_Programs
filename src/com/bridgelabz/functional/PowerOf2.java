/******************************************************************************
 *  Compilation:  javac -d bin PrimeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
 *  
 *  Purpose: This program takes command line argument N and prints the table of the power of 2 that are less than or equal to 2^N.
 *
 *  @author  Dhanashri
 *  @version 1.0
 *  @since   03-10-2019
 *
 ******************************************************************************/



package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class PowerOf2 
{

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter power of 2 less than 31");
		int power=utility.readInteger();
		while(power>31)
		{
			System.out.println("Enter value less than 31");
			power=utility.readInteger();
		}
		utility.printTable(power);
	}

}
