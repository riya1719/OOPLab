 /*
  * Program which Demonstrate the use of a Parent class Shape
  *  which is inherited by the other three class: Circle, Rectangle, and Square.
  * and to compute the area and circumference for a Circle, Rectangle, and a Square
 */
package demo2;


abstract class Shapes
{
	
	String shapeName;
	
	final double PI =3.14;
	
	double circumference;
	double perimeter;
	double area;
		
	abstract void circumference (double side1, double side2, double side3);
    abstract void area(double length, double breath);

}

 class Cirlce1 extends Shapes // Inheritance >> Class Shapes is parent of Circle1 Class 
{
	void circumference (double radius1, double radius2, double radius3) // Method Overriding >> Dynamic polymorphism
	{	   
	    circumference = 2 * PI * radius1;
	   System.out.println("Circumference of a Circle is : " + circumference);
	}
	
	void area(double radius1, double radius2) // Method Overriding
	{
		area = PI * radius1 * radius1;   
		   System.out.println("Area of a Circle is : " + area + '\n' );

	}
	
	
	
}

  class Square1 extends Shapes // Inheritance >> Class Shapes is parent of Square1 Class 
{
	void circumference(double side1 , double side2, double radius3) // Method Overriding >> Dynamic polymorphism
	{
	  perimeter = 4 * side1;
	   System.out.println("Perimeter of a Square is : " + perimeter);
	}
	
	void area(double radius1 , double radius2) // Method Overriding >> Dynamic polymorphism
	{
		area = radius1 * radius1;
	 System.out.println("Area of a Square is : " + area + '\n');
	}
}

 class Rectangle1 extends Shapes // Inheritance >> Class Shapes is parent of Rectangle1 Class 
{
	void circumference (double length, double breath, double height) // Method Overriding
	{
	   perimeter = (2 * length) + (2 * breath);
	   System.out.println("Perimeter of a Rectangle is : " + perimeter);
	}
	
	void area(double length, double breath) // Method Overriding >> Dynamic polymorphism
	{		   
		   area = length * breath;
		   System.out.println("Area of a Rectangle is : " + area + '\n');
	}
}



public class Abstraction {
	public static void main(String[] args)
	{
		//Shapes obj = new Shapes (); >>> cause error
		// Cirlce1 obj = new Cirlce1(); >>> no error
	
		Shapes shape = new Cirlce1 (); // Upcasting
		System.out.println(shape.shapeName = "Circle: ");
		shape.circumference(5.0, 0.0, 0.0);
		shape.area(5.0,0.0);

		shape = new Square1 (); // Upcasting
		System.out.println(shape.shapeName = "Square: ");
		shape.circumference(5.0, 0.0, 0.0);
		shape.area(5.0, 0.0);

		shape = new Rectangle1 (); // Upcasting
		System.out.println(shape.shapeName = "Rectangle: ");
		shape.circumference(5.0,6.0, 0.0);
		shape.area(5.0,6.0);
		
		
	}
}



