/*
 * Program to check whether a leap year or not
 */
package demo;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) throws Exception
	{
	
	Scanner scan = new Scanner(System.in);
		
	// Take input as year from user
			System.out.print("Enter year : ");
			int year = scan.nextInt();
			
		      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		    	  System.out.println(year + " is a leap year");
		      else
		         System.out.println(year + " is not a leap year");


  }
}

