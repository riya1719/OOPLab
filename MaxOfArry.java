package Practice;

public class MaxOfArry {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String s1 = "WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS";
		String s2 = "FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC";
		
		  

		int count =0 , index = 0 , next = 0 , max = 0;
	    String ch ="";

	    for(int j =0 ; j<s2.length();j++)
	    {
	    	for(int i =j ; i<s2.length();i++)
		    {
	    		
	    	
	    	    ch =  s2.charAt(i) + "";
	    	    index = s1.indexOf(s2.charAt(i) , next);
	    	   
		         if ( -1 != index)
		         {
		        	 System.out.println(s2.charAt(i) + "  index: " + index);
		        	 next = index + 1;
		        	 count++; 
		         }
		         
		    }
	    	 System.out.println(count); 
		         if(count > max)
		        	 max = count;
		         next =0;
		         count =0;
		    
		         
	    }
	    
	    
	    
	   System.out.println(count);
	   System.out.println(max);

	    

	    }

}
