/******************************************************************************
 *  Compilation:  javac -d bin PrimeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
 *  
 *  Purpose: Print the percentage of head vs tail.
 *
 *  @author  Dhanashri
 *  @version 1.0
 *  @since   03-10-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class FlipCoin 
{

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter number of time to flip coin : ");
		int time=utility.readInteger();
		Utility.flipPercentage(time);

	}

}
