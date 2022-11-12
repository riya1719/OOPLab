package Practice;

public class Anagramcontains {
	
	public static boolean method(String s, String s2)
	{
		boolean flag = true;
		String temp;
		for (int i =0 ; i< s2.length();)
		{
			 temp = s2.charAt(i) + "";
			if (s.contains(temp))
			i++;
			
			else
				 return flag = false;
		}
		
		return flag;
	}
	
	 
public static void main(String[] args) {
	
	String s = "Geeksforgeek";
	String s2 =  "frogeee";
	
	if (method(s,s2))
	System.out.println("Yes");
	
	else 
		System.out.println("No");

	
	
	
	
	
}

}
