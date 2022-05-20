/*
 * Q1) Create DateManipulator class to: 
 * convert String to date
 * date to String and
 * to find out the number of days between two dates.
 */


package Lists;

import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.Calendar;
import java.text.DateFormat;



public class DateManipulator 
{
	public static void main(String[] args) throws Exception

	{
		// convert String to date
		 String string1 = "13/05/2022";
		 Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(string1);  
	     System.out.println("Converted String to date format :" + date1); 
		
	    
	     String string2 = "13-May-2022" ;  
		 Date date2 = new SimpleDateFormat("dd-MMM-yyyy").parse(string2);
		 System.out.println("Converted String to date format :" + date2 +'\n');


		 // date to String     
	     Date date3 = Calendar.getInstance().getTime();  
	     DateFormat dateFormat1 = new SimpleDateFormat("yyyy-mm-dd ");  
	     String string3 = dateFormat1.format(date3);  
	     System.out.println("Converted date format to String :" + string3); 
	    
	    Date date4 = Calendar.getInstance().getTime();  
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
        String string4 = dateFormat2.format(date4);  
        System.out.println("Converted date format to String :" + string4 +'\n'); 
  
	    // to find out the number of days between two dates
        
       SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
   	   String dateBeforeString = "13 05 2020";
   	   String dateAfterString = "13 06 2020";

   	 try {
   	       Date dateBefore = myFormat.parse(dateBeforeString);
   	       Date dateAfter = myFormat.parse(dateAfterString);
   	       long difference = dateAfter.getTime() - dateBefore.getTime();
   	       // converting milliseconds to days
   	       // & down casting  daysBetween float to int 
   	       int daysBetween = (int) (difference / (1000*60*60*24));
           
   	       
   	    System.out.println("Date of Day Before: " + dateBefore);
   	    System.out.println("Date of Day After: " + dateAfter);

   	    System.out.println("Number of Days between dates: "+ daysBetween + " days");
   	 } 
   	 catch (Exception e)
   	 {
   	       e.printStackTrace();
   	 }
	    
	    
	    
	    
	    
         
	    
	}

}
