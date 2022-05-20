/*
 * Program for finding sum of two prime number equals to given number (GoldBackChecker)
 */
package demo2;
import java.util.Scanner;


public class GoldBackChecker {
	

	static boolean isprime ( int n)
	{
		
	 // Even numbers are not prime number
			if (n % 2 == 0 && n != 1 )
				return false;
				 
			
			else 
	{
				for (int i = 3; i < n/2; i+=2)
			{
				if (n % i == 0)
				 return false;
				
			}
	return true;
	}
	}


	
	public static int[] goldBackChecker (int num)
	{
		
	int j=0;
	int arr1 [] = new int [num]; 
	int arr2 [] = new int [2]; 

	
	for (int i = 1; i < num;i++)
	  {
	Boolean flag = isprime ( i);

	if (flag)
	{
		arr1[j++] = i;
		
	}
	  }
	

	//for (int i = 0; i < n; i++)
	  //{ 
		//System.out.println(arr1 [i] + " ");
		//}

	
	for (int p =0; p < num; p++)
	  {
		for (int k = 0; k < num ; k++ )
			{
			if (arr1[p] == 0)
				break; 
			
			   int sum = arr1[p] + arr1[k];
			   
			   if (sum == num)
				{
					arr2 [0] = arr1[p];
					arr2 [1] = arr1[k];
					return arr2;
				}

		    }
		
		
	  }
	
	return arr2;

	}

	
	public static void main(String[] args)
	{


Scanner scan = new Scanner(System.in);
		
		
		// Take input as number from user
		System.out.print("Enter a number : ");
		int n = scan.nextInt();
		
		int [] result = new int[2];
		
		if (n % 2 == 1 || n < 4)
				{
				for (int i =0; i < 2; i++)
					System.out.print(result [i] + " ");
				}
				
				
				
			else
			{
				 result = goldBackChecker (n);
				 System.out.print("The two prime number whose sum is " + n + " are : ");
				 for (int i =0; i < 2; i++)
				 System.out.print(result [i] + " ");
			}



}
}
