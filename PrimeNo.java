/*
 * Program to check whether a prime number or not
 */


package demo;
import java.util.Scanner;


public class PrimeNo {
	
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		
		boolean flag = true;
		
		// Take input as number from user
		System.out.print("Enter a number : ");
		int number = scan.nextInt();
		
		// For negative numbers
		if (number <= 0)
		 System.out.print(" Invalid Input");
		
		// Even numbers are not prime number
		if (number % 2 == 0 && number != 1 )
			 {
			System.out.print(number + " is not a Prime Number");
			flag = false;
			 }
		
		else 
		{
		for (int i = 3; i < number/2; i+=2)
		{
			if (number/i == 0)
			 flag = false;
			
		}
		}
		
		if (flag)
			System.out.print(number + " is a Prime Number");
	}	
		
	}
		
