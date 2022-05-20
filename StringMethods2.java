 /* Program to demonstrate the usage of different String Methods in java
 */

package demo2;

public class StringMethods2

{
	public static void main(String[] args) 
	
	{
		     String s1 = "HOW ARE YOU FRIEND!"; 

	
	        // charAt>> shows character present at a particular index
			System.out.println("Character present at index 2 of string "+ s1+ ": " + s1.charAt(2) + '\n');
			
			//System.out.println(s1.charAt(32)); // gives Error >>String index out of bounds
			
			System.out.println("Length of string "+ s1+ ": " + s1.length() + '\n');
			
			// Return the Unicode of the character to which pointer points
			System.out.println("Unicode :" + s1.codePointAt(0));
			System.out.println("Unicode :" + s1.codePointBefore(2)+ '\n');
			//System.out.println("" + s1.codePointAfter(2));
			//System.out.println("" + s1.codePointBefore(45)); >> IndexOutOfBoundsException 


			System.out.println("Contains ARE in string "+ s1 + ": " + s1.contains("ARE"));
			System.out.println("Contains Are in string "+ s1 + ": " + s1.contains("Are") + '\n');
			//System.out.println("Contains ARE in string "+ s1+ ": " + s1.contains('R') );


			
			System.out.println("Index of 'O' in string " + s1 +": " + s1.indexOf("O") );
			//returns the index of is substring  
			
			System.out.println("Index of 'o' in string " + s1 +": " + s1.indexOf("o") );
			
			System.out.println("Index of 'o' in string after index 3 " + s1 +": " + s1.indexOf("O", 3) );
			
			System.out.println("Index of "+ "ARE" +" in string " + s1 +": " + s1.indexOf("ARE"));

			System.out.println("Index of "+ "Are" +" in string " + s1 +": " + s1.indexOf("Are") + '\n');
			
			System.out.println("Substring from 4 index: " + s1.substring(4));
			
			System.out.println("Substring from 4 index to 8: " + s1.substring(4, 9) + '\n');
			
			String s2 = "I'm Fine."; 

			System.out.println("Converting to Lower Case: " +s2.toLowerCase());
			
			System.out.println("Converting to Upper Case: " +s2.toUpperCase() + '\n');
			
			System.out.println("Concatinating two strings :" + s1.concat(s2) + '\n');
			
			
			System.out.println("Is string empty: " + s1.isEmpty());
			
			String s3 = "";
			System.out.println("Is string empty: " + s3.isEmpty()+ '\n');
			
			String s4 = "    Hi, How   Are You There     !    ";

			System.out.println("Trim leanding and trailing spaces :" + s4.trim());

			System.out.println("Trim leanding and trailing spaces :" + s3.trim());



			
			

			
			


			






			
			

}
}
