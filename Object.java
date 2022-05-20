/*
 * Program to demonstrate the example of island of isolation to perform some operation
 */
package demo2;

public class Object {
	Object x;
	int number;
	String name;
	
	
	public static void main(String[] args) 
	{
		Object obj1 = new Object ();
		System.out.println("Object1 refence: " + obj1);
		
		Object obj2 = new Object ();
		System.out.println("Object2 refence: " + obj2 + '\n');
		
		obj1.x = obj2;
		obj1.number = 1;
		obj1.name = "Riya";
		
		obj2.x = obj1;
		obj2.number = 2;
		obj2.name = "Royal";
		
		System.out.println("Calling instance of object class by obj1 ");	
		System.out.println(obj1.x);	
		System.out.println(obj1.number);	
		System.out.println(obj1.name + '\n');
		
		System.out.println("Calling instance of object class by obj2");	
		System.out.println(obj2.x);	
		System.out.println(obj2.number);	
		System.out.println(obj2.name + '\n');	
		
		System.out.println("Calling instance of obj1 using obj2.x");	
		System.out.println(obj2.x.number);	
		System.out.println(obj2.x.name + '\n');	

		System.out.println("Calling instance by obj2 using obj1.x ");	
		System.out.println(obj1.x.number );
		System.out.println(obj1.x.name + '\n');	
		
		System.out.println("Modifying instance by obj2 using obj1.x ");	
		obj1.x.name = "SWAPNIL";
		obj2.x.name = "VIPIN";
		System.out.println(obj1.number);	
		System.out.println(obj1.name );
		System.out.println(obj2.number);	
		System.out.println(obj2.name +'\n');
		
		
	}

}
