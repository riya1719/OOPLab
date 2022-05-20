/*
 * Program for different method usage of Upcasting and Downcasting
 */
package demo2;

class parent1 
{

	void fun1() 
	{
		System.out.println("Parent");
	}	
	void fun2()
	{
		System.out.println("fun2");
	}

}
class child1 extends parent1 // child class extends parent class
{
	void fun1() // overriding parent fun1() method
	{
	System.out.println("child");
	}	
	void fun3() // specilased method of child
	{
		System.out.println("special" + '\n');

	}
	
	
}

class parentt
{
	public static void main(String[] args)
	{
		
	parent1 parent = new parent1 ();
	parent.fun1();
	parent.fun2();
	// parent.fun3(); >> cause error
	
	child1 child = new child1 ();
	child.fun1 ();
	child.fun2();
	child.fun3();
	                              
	
	System.out.println("Upcasting: " );
	parent1 obj1 = new child1 (); 
	obj1.fun1();
	obj1.fun2();
	// obj1.fun3(); >> error
	
	System.out.println("DownCasting:" );
	//child1 obj = new parent1 (); // cause error
	parent1 obj2 = new child1();
	child1 obj3 = (child1) obj2;  
	obj3.fun1();
	obj3.fun2();
	obj3.fun3();
	
	}
}