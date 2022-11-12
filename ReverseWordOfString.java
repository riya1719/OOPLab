package Practice;

public class ReverseWordOfString {
	
	public static void main(String[] args) {
		
		String s = "I am riya";
		String rev="";
		
		 s = s+" ";
		int index =0;
		
		while (s.indexOf(" ") != -1)
		{
			index = s.indexOf(" ");
			
			String word =  s.substring(0 , index);
			
			rev = word + " " + rev ;
			
			s = s.substring(index+1);
		}
		
		System.out.println(rev);
		
		
	}
	
	

}
