package Practice;

import java.util.Arrays;

public class InsertElementInarray {
	
	
	public static int[] InsertElement(int a[], int index, int value)
	{
		if (index >= a.length)
		return a;
		
		else
		{
			int result [] = new int [a.length + 1];
		      
		     int count =0;
		      
		      for(int i =0;i< result.length; i++ )
		      {
		    	  if (index == i)
		    		  result[i] = value;
		    	  
		    	  else
		    		  result[i] = a[count++];
		      }
		      return result;
		}
	}
	
	
	public static int[] DeleteElement(int a[], int index, int value)
	{
		if (index >= a.length)
		return a;
		
		else
		{
			int result [] = new int [a.length - 1];
		      
		      int count =0;
		      
		      for(int i =0; i< a.length; i++)
		      {
		    	  if (index != i)
		    	  result[count++] = a[i];
		      }
		      return result;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	      int a [] = {1,2,3,4,5};
	      System.out.println(Arrays.toString(a));
	      
	      int index = 3;
	      int value = 6;
	      
	 
	      System.out.println( Arrays.toString(InsertElement(a, index, value)));
	      
	      System.out.println( Arrays.toString(DeleteElement(a, index, value)));
	      

	}

}
