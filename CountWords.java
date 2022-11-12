package Practice;

public class CountWords { 
	
	public static void countWords(String s)
	{
		int count = 0;
		s = s.trim();
		if (s.isEmpty())
			System.out.println(count);

		else {	
		for(int i=0; i<s.length()-1; i++)
		{
				if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ')
					count++;	
		}
		System.out.println("Number of words = " + ++count); }

	}
	
	public static void LargestWords(String s)
	{
		String s1="",s2="";
		for(int i=0; i < s.length(); i++)
		{
			if (s.charAt(i) != ' ')
			    s1 = s1 + s.charAt(i);

			else 
			{
				if(s2.length() < s1.length() || s2.length() == s1.length())
				  s2 = s1;
				  s1 ="";
				
			}	
			if(i == s.length()-1)
				if(s2.length() < s1.length()|| s2.length() == s1.length())
					s2 = s1;
		}
		
		System.out.println("Largest word = " + s2);

	}
	
	public static void SecondLargestWords(String s)
	{
		String s1="",s2="",sl="";
		for(int i=0; i < s.length(); i++)
		{
			if (s.charAt(i) != ' ')
			    s1 = s1 + s.charAt(i);

			else 
			{
				if(s2.length() < s1.length() || s2.length() == s1.length() || s2.length() == sl.length())
				{ sl = s2;
				  s2 = s1;

				 }
				s1 ="";
				
			}	
			if(i == s.length()-1)
				if(s2.length() < s1.length() || s2.length() == s1.length() || s2.length() == sl.length())
					{sl = s2;
					s2 = s1;
					}
		}
		
		System.out.println("Largest word = " + s2);
		System.out.println("SecondLargest word = " + sl);


	}
	
	public static void Pattern (int N)
	{
		for (int i = 1; i <= N; i++)
		{
			for (int j = 1; j <= N; j++)
			{
				if (j <= N-i)// 4-1=3  4-2=2
				  System.out.print(" ");
				else
					System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void main (String args [])
	   {
		String s = " the the am iamf am";
		countWords(s);
		LargestWords(s);
		SecondLargestWords(s);		
		Pattern (4);
	   
	   }
	
}


