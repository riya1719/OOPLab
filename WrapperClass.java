/*
 * Program to illustrate usage of Wrapper class method Integer
 */

package demo2;

public class WrapperClass {
	
	public static void main(String[] args) 
	{
        Integer object = new Integer(68);
        
        int Return1 = object.intValue();
		int Return2 = Integer.valueOf(object);
		int Return3 = Integer.valueOf(+68);
		int Return4 = Integer.valueOf(-68);

		System.out.println("Int Value of object: " + Return1);
		System.out.println("Integer value Of object: " + Return2);
		
		
        Integer obj = new Integer("35");
        
		int num1 =  obj.intValue();
		int num2 = Integer.valueOf(obj);
		int num3 = Integer.valueOf("+35");
		int num4 = Integer.valueOf("-35");
		
		System.out.println("Int Value of obj : " + num1);
		System.out.println("Integer value Of obj: " + num2);
		System.out.println("Integer value Of +35: " + num3);
		System.out.println("Integer value Of -35: " + num4);
		
		Float obj2 = new Float(568f);  
        System.out.println("Integer Value of obj2: "+ obj2.intValue());  
        Double obj3 = new Double(55.76);  
        System.out.println("Integer Value of obj3: "+obj3.intValue()); 
        
		System.out.println("Integer Value of parseInt 20 : " + Integer.parseInt("20"));
		System.out.println("Integer Value of parseInt +20 : " + Integer.parseInt("+20"));  
		System.out.println("Integer Value of parseInt -20 : " + Integer.parseInt("-20"));  
 
        
        // System.out.println(Integer.parseInt("10A"));
		// passing hex value gives error
        
		System.out.println("Integer Value of parseInt octal 150 : " + Integer.parseInt("150", 8));  
		System.out.println("Integer Value of parseInt Hexa -200 : " + Integer.parseInt("-200", 16));  
		System.out.println("Integer Value of parseInt Binary 101 : " + Integer.parseInt("101", 2)); 
		
        





		
		
		
		
		
		
		
		
		

		
		
		
		
	}
	
	

}
