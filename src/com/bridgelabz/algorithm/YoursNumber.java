/******************************************************************************
 *  Compilation:  javac -d bin FindYourNumber.java
 *  Execution:    java -cp bin com.bridgelabz.util.findYourNumber()
 *  
 *  Purpose: Guess the number given by user and check by asking user,imlementing by using binary search
 *
 *  @author  Dhanashri
 *  @version 1.0
 *  @since   03-10-2019
 *
 ******************************************************************************/



package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class YoursNumber 
{

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		
		System.out.println("guess a no between 0 to 127 ");
		utility.readInteger();
		
			System.out.println("guessed no is " + utility.findYourNumber());
		

	}

}
