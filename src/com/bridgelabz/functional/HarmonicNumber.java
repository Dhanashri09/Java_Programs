/******************************************************************************
 *  Compilation:  javac -d bin PrimeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
 *  
 *  Purpose: Replace <<UserName>> to user name.
 *
 *  @author  Dhanashri
 *  @version 1.0
 *  @since   03-10-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class HarmonicNumber 
{

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter number : ");
		int number=utility.readInteger();
		System.out.println(utility.harmoniNumber(number));
	}

}