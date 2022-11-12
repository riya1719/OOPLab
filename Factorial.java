

/*
 * 1. Program to find factorial of a given number
 */

package demo;

import java.util.Scanner;

public class Factorial {

static int factorial ( int n)
{
int Fact=1;

if (n == 0 || n ==1)
return 1;

else
{			
 for (int i = n; i > 1; i--)
 Fact = Fact * i;
 return Fact;
}


}
	public static void main(String[] args)
	{
		
	Scanner scan =new Scanner (System.in);
	            
         // Take input as number from user
		System.out.print("Enter the number: ");
		int n = scan.nextInt();
                          
// If user enters negative values
                         if (n < 0)
			System.out.println("Invalid Input");

// call method factorial and store return in result
int result = factorial (n);

// Display the factorial as result
System.out.println("Factorial of " + n + " is "+ result );
}
}


