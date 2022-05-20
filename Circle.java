/*
 * 3. Program to compute area of circle
 * using private data members,getter & setter
 */

package demo2;

public class Circle {
	
	private double radius;
	static double pi =3.14;
	
	// For setting value of radius
	 void  setRadius(double radius)
	{
		this.radius = radius;
	}
		//For  Getting value of radius

	 double getRadius()
		{
			return radius;
		}
	 
		//Compute Area of circle
	  double Area()
	 {
		 double Area = pi * radius * radius;
		 return Area;
	 }
	 
		//Compute Circumference of circle
	  double Circumference()
	 {
		 double Circumference = 2 * pi * radius;
		 
		 return Circumference;
	 }
	  
	  // Display Area and circumference of circle
	  void display()
	  {
		  System.out.print("Area of circle: ");
		  System.out.println(Area());
		  
			System.out.print("Circumference of circle: ");
		  System.out.println(Circumference());
	  }
	
	
	  public static void main(String[] args) {
		  Circle obj = new Circle();
		  obj.setRadius(5); // radius as 5
		  obj.display();
		  
	  }

}
