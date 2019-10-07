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

public class UserInput 
{

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		String name=new String("Hello <<UserName>>, How are you?");
		System.out.println("Enter the Name");

		String replace=utility.readString();
		String result=utility.userName(name, replace);
		System.out.println(result);

	}

}
