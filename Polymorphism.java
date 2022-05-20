 /*
  * Program which Demonstrate the use of a Parent class Shape
  *  which is inherited by the other three class: Circle, Rectangle, and Square.
  * and to compute the area and circumference for a Circle, Rectangle, and a Square
 */

package demo2;

 class Shape
{
	
	String shapeName;
	
	final double PI =3.14;
	double length;
	double breath;
	
	double circumference;
	double perimeter;
	double area;
	
	void circumference (double radius)
	{}
	void area(double radius)
	{}
	void area(double length, double breath)
	{}

}

class Cirlce extends Shape // Circle is inheriting Shape class
{
	void circumference (double radius) // Method overriding
	{	   
	    circumference = 2 * PI * radius;
	   System.out.println("Circumference of a Circle is : " + circumference);
	}
	
	void area(double radius) // Method overriding
	{
		area = PI * radius * radius;   
		   System.out.println("Area of a Circle is : " + area);
	}
}


class Square extends Shape // Square is inheriting Shape class
{
	void perimeter (double radius) // Specialised Method 
	{
	  perimeter = 4 * radius;
	   System.out.println("Perimeter of a Square is : " + perimeter);
	}
	
	void area(double radius) // Method overriding
	{
		area = radius * radius;
	 System.out.println("Area of a Square is : " + area);
	}
}


class Rectangle extends Shape // Rectangle is inheriting Shape class
{
	void perimeter (double length, double breath) //  Specialised Method
	{
	   perimeter = (2 * length) + (2 * breath);
	   System.out.println("Perimeter of a Rectangle is : " + perimeter);
	}
	
	void area(double length, double breath)  // Method overriding
	{		   
		   area = length * breath;
		   System.out.println("Area of a Rectangle is : " + area);
	}
}


class Traingle extends Shape // Triangle is inheriting Shape class
{
	
	void area(double base, double height)  // Method overriding
	{		   
		   double area = 0.5  * base * height;
		   System.out.println("Area of a Triangle is : " + area);
	}
}


class Polymorphism
{
	public static void main(String[] args)
	{
		Shape obj1 = new Cirlce ();
		System.out.println(obj1.shapeName = "Circle: ");
		obj1.circumference(5);
		obj1.area(5);
		//System.out.println();
		
		Shape obj2 = new Square ();
		System.out.println(obj2.shapeName = "Square: ");
		Square obj3 = (Square) obj2;
		obj3.perimeter(5);
		obj3.area(5);
		//System.out.println();

		
		Shape obj4 = new Rectangle ();
		System.out.println(obj4.shapeName = "Rectangle: ");
		Rectangle obj5 = (Rectangle) obj4;
		obj5.perimeter(5,6);
		obj5.area(5,6);
		System.out.println();

		
		Shape obj6 = new Traingle();
		System.out.println(obj6.shapeName = "Traingle: ");
		obj6.area(5,8);
		System.out.println();

		

		
	}
}