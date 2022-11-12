package Practice;

public class StringRotation {
	
	public static boolean main(String s , String s1)
	{

          boolean flag = false;
		
		if (s.length() != s1.length())
		return flag;
		
						
				else if (s1.indexOf(s.charAt(0)) == -1)
					return flag;
					
				
				
				else {
					
					for (int j = 0 ; j< s.length();)
					{
						int index = s1.indexOf(s.charAt(0));
						
						if (s.charAt(j) == s1.charAt((index + j) % s.length()))
							j++;
						
						else
							return flag;
						
					}
					return flag =true;

				}
				


	}

	
	
	
	 public static void main(String[] args) {
		 
		String s = "abcd";
		String s1 = "bcda";
		
		if (main(s,s1))
			System.out.println("yes");
		else
			System.out.println("No");

		
		
		
		
		
		
		
	 }
}
	
	
