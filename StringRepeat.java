package Practice;

import java.util.Arrays;

public class StringRepeat {
	
	public static void Method (String s1, String s2)
	{
		
		
	    int count =0;
	    int a [] = new int [26];
	    int b [] = new int [26];
	    for(int i =0 ; i<s1.length(); i++)
	    {
	        int index = (int)s1.charAt(i) - 97 ;
	        a[index]++;
	       
	    }
	    
	    
	    for(int i =0 ; i<s2.length(); i++)
	    {
	         int index = (int)s2.charAt(i) - 97;
	        b[index]++;
	    }
	    
	    System.out.println(Arrays.toString(a));
	    System.out.println(Arrays.toString(b));
	    for(int i =0 ; i<26; i++)
	    {
	        count = count + Math.abs(a[i] - b[i]); 
	    }

	    System.out.println( count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "cde";
		String s2 = "abc";
		
		Method(s1,s2);
		

		 
		 
		
		

	}

}
