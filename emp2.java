/*
 * 1.Static methods

 * 2.static blocks
 * 3.Instance block
 * 4.Instance Method
 * 5.Default constructor
 */

package demo2;

class OOPS  {
	
	int z; // instance
	static int x;
	static float y;
	
	{
		System.out.println("Instance block");	
		System.out.println("Initial values of x: " + x);
		System.out.println("Initial values of y: " + y);

	}
	static 
	{
		System.out.println("Static block");	
		System.out.println("Initial values of x: " + x);
		System.out.println("Initial values of y: " + y);
		//System.out.println("Initial values of z: " + z);
		

	}
	
	static void Increment()
	{
		System.out.println("Static method");	

		x++;
		y++;
		System.out.println("After incrementing value of x: " + x);
		System.out.println("After incrementing value of y: " + y);
	}

	
	void Sum ()
	{
		System.out.println("Instance method");	

	}


	OOPS () // Constructor
	{
		System.out.println("Default constructor");	
		x = 5;
		y = 10.55f;
		
		System.out.println("After constructor call value of x: " + x);
		System.out.println("After constructor call value of y: " + y);
		
	}

		
}

class emp2
{
	
	public static void main(String[] args) {

		// creating an object for calling Static constructor
		OOPS.Increment();
		
		//OOPS  obj = new OOPS (); 
		//obj.Sum();

	
}
}
