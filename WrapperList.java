/*
 * Create a list of java defined wrapper classes and perform:
 *  Insert
 *  Delete
 *  Search
 *  Iterate
 *  sort operations.
 */
package Lists;

import java.util.*;

public class WrapperList {
	public static void main(String[] args)

	{
		// Creating a list of Integer class
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// Inserting elements in list
		
		list.add(32); // passing int instead of Integer object (wrapping)
		list.add(55);
		list.add(72);
		list.add(36);
		list.add(89);
		list.add(63); 
		list.add(55);
		list.add(63); // 63 repeated

		
		System.out.println(list);
		
		// Deleting elements from list
		
		// Deleting element from index 1
		list.remove(1); 
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(63); 
		list2.add(55); 
		System.out.println(list2);

		// deleting all elements from list1 which present in list2
		list.removeAll(list2); 
		System.out.println(list);
		
		// Searching of elements in list
		
		// Searching of element in list at which index
		System.out.println(list.indexOf(72));
		// checking whether list contains element or not
		System.out.println(list.contains(72)); 
		
		// Iterating the list
		for(Integer obj : list)
			System.out.print(obj +  " ");
		
		// Sorting the list in ascending order
		Collections.sort(list);
		System.out.println(list);
	
		
		
	}

	
	

}
