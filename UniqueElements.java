package Practice;

import java.util.*;

 public class UniqueElements 
{
	 
	    public static void main(String[] args) {
	    	
	    	int arr [] = {4,3,1,2,4,2,1,7};
	    		    	
	    	 System.out.println(Arrays.toString(arr));
	
    HashSet <Integer> ll1 = new HashSet<Integer> ();

	    	for(int i = 1; i< arr.length;i++)
	    	{
	    		if (!ll1.contains(arr[i]))
	    			ll1.add(arr[i]);
	    	}
	    	
	    	System.out.println(ll1);
	
	 }
}