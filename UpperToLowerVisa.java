package Practice;

import java.util.Arrays;

public class UpperToLowerVisa {
	
	public static void main(String[] args) 
	{
		
		String s ="AbcdF";
		StringBuffer res =  new StringBuffer();
		
	    for(int i =0; i< s.length(); i++)
	{
		if(Character.isUpperCase(s.charAt(i)))
			res = res.append( (char) (s.charAt(i) + 32));
			
			if(Character.isLowerCase(s.charAt(i)))
				res = res.append( (char) (s.charAt(i) - 32));
			
	}
		
	System.out.println(res);
	
      
}

}
