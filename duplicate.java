package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class duplicate {
	
	public static void main (String args [])
	   {
		int a [] = {1,3,4,3,2,5,6};
		
		
		// Method1 (does not maintains order)
		
		HashSet <Integer> set =  new HashSet <Integer> ();
		
		for(int i : a)
			set.add(i);
		
		System.out.println(set);
		
		// method2 ( maintain order)
		
		LinkedHashSet <Integer> LSet = new LinkedHashSet <Integer>();
		for(int i : a)
			LSet.add(i);
		
		System.out.println(LSet);

			
		// Method3 W/o hashset
		LinkedList <Integer>list = new LinkedList <Integer> ();
		
		for(int i =0; i< a.length;i++) {
			if (!list.contains(a[i]))
			{
				list.add(a[i]);
			}
			
		}
		System.out.println(list);
		
		
		
	   }

}
