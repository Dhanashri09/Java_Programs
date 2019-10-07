/******************************************************************************
 *  Compilation:  javac -d bin VendingMachine.java
 *  Execution:    java -cp bin com.bridgelabz.util.Notes
 *  
 *  Purpose: to calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change

 *
 *  @author  Dhanashri
 *  @version 1.0
 *  @since   03-10-2019
 *
 ******************************************************************************/




package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class VendingMachine 
{

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		int notes[]={1000,500,100,50,10,5,2,1};
		System.out.println("Enter value : ");
		int value=utility.readInteger();
		utility.Notes(value);

	}

}
