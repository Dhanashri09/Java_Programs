package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class PrintPrimeNumber {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		
		System.out.println("Enter start point : ");
		int a=utility.readInteger();
		System.out.println("Enter last limit : ");
		int b=utility.readInteger();
		System.out.println("Prime numbers between " + a +" and " + b +" are : " );
		System.out.println(utility.printPrimeNumbers(a, b)); 

	}

}
