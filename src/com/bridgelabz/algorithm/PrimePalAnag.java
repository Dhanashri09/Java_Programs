/******************************************************************************
 *  Compilation:  javac -d bin PrimePalAnag.java
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

public class PrimePalAnag 
{
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		
	
	int ch=0;
	
	do
	{
		System.out.println();
		
		System.out.println("--------Your Choice----------");
		System.out.println("1. Print Prime Numbers Between 1 To 1000");
		System.out.println("2. Print Prime palindrome Numbers");
		System.out.println("3. Print Prime Anagram Numbers");
		System.out.println("4. Exit");
		System.out.println();
		System.out.println("Enter Your Choice:");
		System.out.println();
		int choice=utility.readInteger();//=u.inputInteger();
		System.out.println();
		
		switch(choice)
		{
		case 1:
				/*
				 * System.out.println("Enter start point : "); int a=utility.readInteger();
				 * System.out.println("Enter last limit : "); int b=utility.readInteger();
				 */
//			System.out.println("Prime numbers between " + a +" and " + b +" are : " );
			System.out.println("Prime numbers between 1 to 1000 are : " );
			utility.prime();
			
			break;
			
		case 2:
			System.out.println("Prime Palindrome numbers are :");
			utility.primePalindrome();
			break;
			
		case 3:
			System.out.println("Prime Anagram Numbers Are : ");
			utility.primeAnagrams();
			break;
			
		case 4:
			System.exit(0);
			break;
		}
		
		
	}
	while(ch<5);	
	
}
}
