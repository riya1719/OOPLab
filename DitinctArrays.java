package Practice;

import java.util.*;

public class DitinctArrays {
	
	 public static void intersection(int[] nums1, int[] nums2) 
	    {
		 
			System.out.println(Arrays.toString(nums1));
			System.out.println(Arrays.toString(nums2));

	
 	HashSet <Integer> ll1 = new HashSet<Integer> ();


for(int i = 0; i < nums1.length;i++)
{ 
    for(int j = 0; j< nums2.length;j++)
    {
        if(nums1[i] == nums2[j])
        {
        	   ll1.add(nums2[j]) ; 
       
        }
    } 
}
    
    int temp [] = new int [ll1.size()];
    
    int i =0;
    for(int a : ll1)
    {
      temp [i] = a; i++;
    }
    
	System.out.println(Arrays.toString(temp));


}

public static void main(String[] args) {

	int nums1 [] = {1,2,3,2,1,4};
	int a [] = new int [5];
	
	int nums2 [] = {3,4,1,4};
	
	intersection(nums1,nums2);
}

}
