package Practice;

public class EachString {
	
	 public static void main(String[] args) {
		 
		 String s = "abdbcccc";
		 String s1 = ""; 
		 int count =0;
		 		 
		 for (int i = 0 ; i <s.length(); i++)
		 {
			String ch = s.charAt(i) + "";
			 
			 if (!s1.contains(ch))
				 {
				 count++;
				 s1 = s1 + ch;
				
				 }
				 
		 }
		 
		 System.out.println(count);
		 
//		 A obj = new A();
//		 obj.getX();


	 }
	 
	
}

//class A
//{
//	private int x = 5;
//
//	public int getX() {
//		return x;
//	}
//
//	public void setX(int x) {
//		this.x = x;
//	}
//	
//	
//	
//}
