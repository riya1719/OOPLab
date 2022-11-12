package Practice;
import java.util.*;


public class MultipleSumOfElements {
	
    
 public static HashSet<List<Integer>> threeSum(int[] nums) {
        
	 HashSet<List<Integer>> res = new  HashSet<List<Integer>>();
	 
	 List<Integer> list = new LinkedList<Integer>();
	 ArrayList<Integer> list1 = new ArrayList<Integer>();


	 
	 
	 
	 int sum = nums[0];
	 for (int i=0; i<nums.length; i++)
	 {
//		 res.list.add(nums[i]);
//		 if(sum == 0)
			 
	 }
	 
	 

      return res;  
    }

    
    public static void main(String[] args) {
    	
    	int nums [] = {4,3,1,2,4,2,1,7};
    	
    	int res [] = new int [nums.length];
    	
    	for (int i=0; i<nums.length;i++ )
    	{
    		res[nums[i]]++;
    	}
    	
    	// String s = a+b;
    	System.out.println(Arrays.toString(res));
    	
    	int i =0;
    	System.out.println(i++);
    	System.out.println(i);


    	
    }


}
