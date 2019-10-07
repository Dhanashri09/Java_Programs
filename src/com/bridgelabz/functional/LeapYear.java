/******************************************************************************
 *  Compilation:  javac -d bin PrimeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
 *  
 *  Purpose: To check whether the year is leap year or not.
 *
 *  @author  Dhanashri
 *  @version 1.0
 *  @since   03-10-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter year to check : ");
		int year=utility.readInteger();
		
		while(year<999 && year>9999)
		{
			System.out.println("Enter year in 4 digit");
			year=utility.readInteger();
		}
		
		if(utility.isLeapYear(year))
		{
			System.out.println("Year is leap year");
		}
		
		else
		{
			System.out.println("Year is not leap year");
		}

	}

}
