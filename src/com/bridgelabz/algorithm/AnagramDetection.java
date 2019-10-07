/******************************************************************************
 *  Compilation:  javac -d bin AnagramDetection.java
 *  Execution:    java -cp bin com.bridgelabz.util.chechAnagram(first,second)
 *  
 *  Purpose: check two strings are anagram to each other or not.
 *
 *  @author  Dhanashri
 *  @version 1.0
 *  @since   03-10-2019
 *
 ******************************************************************************/


package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class AnagramDetection 
{

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter first string : ");
		String first=utility.readString();
		
		System.out.println("Enter second string : ");
		String second=utility.readString();
		
		if(utility.checkAnagram(first, second))
		{
			System.out.println("Strings are anagram to each other");
		}
		else
		{
			System.out.println("Strings are not anagram to ecah other");
		}

	}

}
