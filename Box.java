/*
 * 4.Program to swap dimension of box class object at their memory location
 */
package demo2;

import java.util.Scanner;

public class Box 
{
	float length;
	float breath;
	float height;
	int number;
	
	Box (int number)
	{
		this.number = number;
	}
	
	public static void swap(Box b1, Box b2)
	{
		float temp;
		
		temp = b1.length;
		b1.length = b2.length;
		b2.length = temp;
		
		temp = b1.breath;
		b1.breath = b2.breath;
		b2.breath = temp;
		
		temp = b1.height;
		b1.height = b2.height;
		b2.height = temp;
	}
	
	public void disp()
	{
		System.out.println("Box number : " + number);
		System.out.println("Length is : " + length);
		System.out.println("Breath is : " + breath);
		System.out.println("Height is : " + height + '\n');

	}

	public static void main(String[] args) 
	{
		//Setting values of Box 1
		Box Box1 = new Box(1);
		Box1.length = 10.5f;
		Box1.breath = 20.4f;
		Box1.height = 30.6f;

		//Setting values of Box 2
		Box Box2 = new Box(2);
		Box2.length = 40.5f;
		Box2.breath = 50.4f;
		Box2.height = 60.6f;
		
		System.out.println("Before Swaping");
		Box1.disp();
		Box2.disp();
		
		System.out.println("After Swaping");
		swap(Box1,Box2); 
		Box1.disp();
		Box2.disp();

		
		

		
	  
}
	
}

	

