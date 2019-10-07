/******************************************************************************
 *  Compilation:  javac -d bin SumofThreeIntegers.java
 *  Execution:    java -cp bin com.bridgelabz.util.sumOfThreeIntegers(array)
 *  
 *  Purpose: Print the three array elements whose addition is zero.
 *
 *  @author  Dhanashri
 *  @version 1.0
 *  @since   03-10-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class SumOfThreeIntegers 
{

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter size of array ");
		int size=utility.readInteger();
		int array[]=new int[size];
		System.out.println("Enter array elements :");
		for(int i=0;i<array.length;i++)
		{
			array[i]=utility.readInteger();
		}
		
		int result=utility.sumOfThreeIntegers(array);
		System.out.println(result);
		//System.out.println("There are "+utility.count+"elements");
	}

}
