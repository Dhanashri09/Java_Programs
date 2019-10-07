/******************************************************************************
 *  Compilation:  javac -d bin BubbleSort.java
 *  Execution:    java -cp bin com.bridgelabz.util.chechAnagram(first,second)
 *  
 *  Purpose: Reads in integers prints them in sorted order using Bubble Sort.
 *
 *  @author  Dhanashri
 *  @version 1.0
 *  @since   03-10-2019
 *
 ******************************************************************************/



package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter size of array : ");
		int size=utility.readInteger();
		System.out.println("Enter array elements : ");
		int array[]=utility.input1DArray(size);
		System.out.println(utility.bubbleSort(array));

	}

}
