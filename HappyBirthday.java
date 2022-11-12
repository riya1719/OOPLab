package demo;
/*
 * Program for printing Happy Birthday in front of users birthday month
 */

import java.util.Scanner;

public class HappyBirthday {
	
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		
		
		// Take input as month from user
		System.out.print("Enter the month of your birthday: ");
		int month = scan.nextInt();
		
		// Check whether user input months in a range between 1 to 12 
		if (month < 1 && month > 12)
		{
			  System.out.println("Invalid Input");

		}
		
		if (month == 1)
		  System.out.println("January Happy Birthday");
		else 
			  System.out.println("January");
		

		if (month == 2)
		  System.out.println("February Happy Birthday");
		else 
			  System.out.println("February");
		
		if (month == 3)
			  System.out.println("March Happy Birthday");
			else 
				  System.out.println("March");
		
		if (month == 4)
			  System.out.println("April Happy Birthday");
			else 
				  System.out.println("April");
		
		if (month == 5)
			  System.out.println("May Happy Birthday");
			else 
				  System.out.println("May");
		
		if (month == 6)
			  System.out.println("June Happy Birthday");
			else 
				  System.out.println("June");
		
		if (month == 7)
			  System.out.println("July Happy Birthday");
			else 
				  System.out.println("July");
		
		if (month == 8)
			  System.out.println("August Happy Birthday");
			else 
				  System.out.println("August");
		
		if (month == 9)
			  System.out.println("September Happy Birthday");
			else 
				  System.out.println("September");
		
		if (month == 10)
			  System.out.println("October Happy Birthday");
			else 
				  System.out.println("October");
		
		if (month == 11)
			  System.out.println("November Happy Birthday");
			else 
				  System.out.println("November");
		
		if (month == 12)
			  System.out.println("December Happy Birthday");
			else 
				  System.out.println("December");
		
		
		
		
		
		


		
		
		
		
	}
	

}
