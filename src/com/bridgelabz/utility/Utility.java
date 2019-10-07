package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Utility 
{
	static Utility utility=new Utility();
	static Scanner scanner=new Scanner(System.in);
	
	/**
	 * Function to take string input from user
	 * 
	 * @return users string input
	 */
	public String readString()
	{
		return scanner.nextLine();
	}
	
	
	/**
	 * Function to take integer input from user
	 * 
	 * @return users integer input
	 */
	public int readInteger()
	{
		return scanner.nextInt();
	}
	
	
	/**
	 * Function to take double input from user
	 * 
	 * @return	users double input
	 */
	public double readDouble()
	{
		return scanner.nextDouble();
	}
	
	
	public int[] input1DArray(int arraySize){
		int array[]=new int[arraySize];
		for(int i=0;i<arraySize;i++){
			//System.out.println("Enter array["+i+"] : ");
			array[i]=readInteger();
		}
		return array;
	}
	
	
	
	
		
	/**
	 * Function to replace <<UserName>> with name.
	 *  
	 * @param name 		name is the string
	 * @param replace	replace is the string which is replaced instead of <<UserName>>
	 * @return			return name
	 */
	public  String userName(String name,String replace)
	{
		name=name.replaceAll("<<UserName>>", replace);
		return name;
	}
	
	
	/**
	 * Function to print the percentage of head vs tail
	 * 
	 * @param time	the value of how many time flip the coin
	 */
	public static void flipPercentage(int time)
	{
		double head=0;
		for(int i=0;i<time;i++)
		{
			if(Math.random()>0.5)
			{
				head++;
			}
		}
		System.out.println("Heads percentage  :"+(float) (head / time) * 100);
		System.out.println("tails percentage is " + (float) (time - head) / time * 100);
	}
	
	
	/**
	 * Function to check whether the year is leap year or not.
	 *  
	 * @param year	the value of year to check.
	 * @return		return true if the year is leap year else return false.
	 */
	public boolean isLeapYear(int year)
	{
		return ((year%4==0) && (year%100!=0)) || (year%400==0);
	}
	
	
	/**
	 * Function to print the table of 2.
	 * 
	 * @param power	the value for the number of time table of 2 will be printed.
	 */
	public void printTable(int power)
	{
		int value=1;
		for(int i=1;i<power;i++)
		{
			value=value*2;
			System.out.println(value);
		}
	}
	
	
	/**
	 * Function to print harmonic number.
	 * 
	 * @param n		the number for which calculate harmonic value.
	 * @return		harmonic number.
	 */
	public float harmoniNumber(int n)
	{
		float harmonic=1;
		for(int i=2;i<n;i++)
		{
			harmonic=harmonic+1/i;
		}
		return harmonic;
		
	}
	
	/**
	 * Function to find the three elements of array whose additon is zero
	 * 
	 * @param array array elements
	 * @return		returns array elements whose addition is zero
	 */
	public int sumOfThreeIntegers(int array[])
	{
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				for(int k=j+1;k<array.length;k++)
				{
					if(array[i]+array[j]+array[k]==0)
					{
						System.out.println(array[i] + "+" + array[j] + "+" + array[k] + "=" + "0");
						count++;
					}
				}
			}
		}
		return count;
	}
	
	
	/**
	 * @param n
	 * @return
	 */
	public boolean primeFactos(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Function to check whether the strings are anagram or not
	 * 
	 * 
	 * @param first		the value of first string
	 * @param second	the value of second string
	 * @return			return two arrays are anagram or not
	 */
	public boolean checkAnagram(String first,String second)
	{
		first=first.replaceAll("//s","");
		second=second.replaceAll("//s","");
		
				
		if(first.length()!=second.length())
			return false;
		else
		{
			char array1[]=first.toLowerCase().toCharArray();
			char array2[]=second.toLowerCase().toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			return(Arrays.equals(array1, array2));
		}
		
	}
	
	
	/**
	 * Function to print prime numbers within range o to 1000
	 * 
	 * @param a 	take values from range a
	 * @param b		limit upto b
	 * @return		return ArrayList with prime numbers
	 */
	public ArrayList printPrimeNumbers(int a, int b)
	{
		int flag=0;
		
		int k=0;
		
		ArrayList al=new ArrayList();
		for(int i=a;i<b;i++)
		{  
			int counter=0;
		     flag=1;
			for(int j=i;j>=1;j--)
			{
				if(i % j == 0)
				{
//					flag=0;
//					break;
//					
					counter=counter+1;
					
				}
			}
			/*
			 * if(flag==1) { al.add(i);
			 * 
			 * }
			 */
			if(counter==2)
			{
				al.add(i);
			}
				
		}
		return al;
	}
	
	
	
	/*
	 * public void bubbleSort(int array[]) { for(int i=0;i<array.length;i++) { int
	 * flag=0; for(int j=0;j<array.length-1;j++) { if(array[j]>array[j+1]) { int
	 * temp=array[j]; array[j]=array[j+1]; array[j+1]=temp; flag=1; } } if(flag==0)
	 * break; }
	 * 
	 * }
	 */
	
	
	
	public void prime() 
	{
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b)
				System.out.print(j + " ");
			
		}
	}
	
	public static boolean isPallindrome(int n) {
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}
		if (sum == n) {
			return true;
		}
		return false;
	}
	
	public void primePalindrome() 
	{
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b && isPallindrome(j))
				System.out.print(j + " ");
			
		}
	}
	public static int[] count(int n) {
		int[] count = new int[10];
		int temp = n;
		while (temp != 0) {
			int r = temp % 10;
			count[r]++;
			temp = temp / 10;
		}
		return count;
	}

	
	public static boolean anagram(int n1, int n2) 
	{
		int[] n1count = count(n1);
		int[] n2count = count(n2);
		for (int i = 0; i < n2count.length; i++) 
		{
			if (n1count[i] != n2count[i]) 
			{
				return false;
			}
		}
		return true;
	}
	
	public void primeAnagrams() 
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) 
		{
			b = true;
			for (int i = 2; i < j / 2; i++) 
			{
				if (j % i == 0) 
				{
					b = false;
					break;
				}
			}
			if (b)
				ar.add(j);
		}
		for (int i = 0; i < ar.size(); i++) 
		{
			for (int j = i + 1; j < ar.size(); j++) 
			{
				if (anagram(ar.get(i), ar.get(j)))
				{
					System.out.println(ar.get(i) + "  " + ar.get(j));
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	public static int[] bubbleSort(int[] arr) 
	{
		int temp;
		for (int i = 0; i < arr.length - 1; i++) 
		{
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (arr[i] > arr[j]) 
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}
		return arr;
	}
	
	
	
	
	
	
	
	static int i=0,total=0;
	static int notes[]= {1000,500,100,50,10,5,2,1};
	
	
	public static void Notes(int value)
	{
	
		int i=0,total=0;
		if(value/notes[i]!=0)
		{
			total+=(value/notes[i]);
			System.out.println(notes[i]+"rs notes :"+value/notes[i]);
			value=value%notes[i];
		}
		i++;
		
		if(value==0)
		{
			System.out.println("Total Notes :"+total);
			return;
		}
	//	System.out.println("Notes"+notes[i]+"value "+value) ;
		System.out.println("value "+value);
		Notes(value);

	}
	
	/**
	 * Function to guess the number taken by user
	 * 
	 * @return guesses the number
	 */
	public int findYourNumber()//int low,int high)
	{
		int low = 0, high = 127, mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			int c =utility.readInteger();
			mid = (low + high) / 2;
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
			
	}
	
	
	
	
	public static int stringBinarySearch(int a[],int min,int max) 
	{
		while (min <= max) 
		{
			int mid = (min + max) / 2;
			if (a[mid].compareTo(key) < 0) 
			{ 
				min = mid + 1; 
			} 
			else if (a[mid].compareTo(key) >0) 
			{
				max = mid - 1;
			} 
			else
			{
				return mid;
			}
		}
		return -1;
	}
	
		// dhanshri
}
