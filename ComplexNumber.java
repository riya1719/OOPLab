/*
 * 5. Program for complex number and addition of complex number
 */
package demo2;

public class ComplexNumber {
	
	double real;
	double imaginary;
	
	
	ComplexNumber()
	{
		
	}
	
	ComplexNumber (double real, double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;	
	}
	
	// Complex  Number has only real part
	ComplexNumber (double real)
	{
		this.real = real;
		this.imaginary = 0;
	}
	
		
	static void disp (ComplexNumber num)
	{
		if (num.imaginary < 0) // negative imaginary
			System.out.println(num.real + "" + num.imaginary + "i" + '\n');

		
		else
			System.out.println(num.real + "+" + num.imaginary + "i" +  '\n');	
	}
	
	ComplexNumber add(ComplexNumber num1 ,ComplexNumber num2 )
	{
		ComplexNumber temp  = new ComplexNumber ();
		temp.real = num1.real + num2.real;
		temp.imaginary = num1.imaginary + num2.imaginary;
		return temp;
		
	}
	 
	ComplexNumber sub(ComplexNumber num1 ,ComplexNumber num2 )
		{
			ComplexNumber temp  = new ComplexNumber ();
			temp.real = num1.real - num2.real;
			temp.imaginary = num1.imaginary - num2.imaginary;
			return temp;

			
		}
	ComplexNumber mul(ComplexNumber num1 ,ComplexNumber num2 )
		{
			ComplexNumber temp  = new ComplexNumber ();
			temp.real = (num1.real * num2.real) + (num1.imaginary * num2.imaginary * -1);
			temp.imaginary = (num1.real * num2.imaginary) + (num2.real * num1.imaginary);
			return temp;
			
		}
	 
	ComplexNumber divd(ComplexNumber num1 ,ComplexNumber num2 )
		{
			
		// Creating complex conjugate by passing variable 2 imaginary part as negative
		ComplexNumber ComplexConjugate  = new ComplexNumber (num2.real, -num2.imaginary);
		
			// numerator multiplication stored in temp1
			ComplexNumber temp1  = new ComplexNumber (); 
			temp1 = mul(num1,ComplexConjugate ); // calling multiplication method >> mul

			
			// denominator multiplication stored in temp2
			ComplexNumber temp2  = new ComplexNumber ();
			temp2 = mul(num2,ComplexConjugate ); // calling multiplication method >> mul
			
			// Final result is store in temp
			ComplexNumber temp  = new ComplexNumber ();
			temp.real = temp1.real / temp2.real;
			
			// to avoid divide by zero exception
			if (temp2.imaginary == 0)
				temp.imaginary = 0;
			else
			temp.imaginary = temp1.imaginary / temp2.imaginary;	
			
			return temp;
			
		}
	 
	
	void setReal(double real)
	  {this.real = real;}
	
	void setImaginary(double imaginary)
	  {this.imaginary = imaginary;}
	
	double getReal()
	  {return real;}
	
	double getImaginary()
	  {return imaginary;}
	
	public static void main(String[] args) 
	{
		System.out.print("Initial value: ");
		ComplexNumber num = new ComplexNumber ();
		disp (num);

		System.out.println("Passing real and imaginary values for 1st number");
		ComplexNumber num1 = new ComplexNumber (3,4);
		disp (num1);

		System.out.println("Passing real and imaginary values for 2nd number");
		ComplexNumber num2 = new ComplexNumber (8,-2);
		disp(num2);

		
		ComplexNumber temp = new ComplexNumber ();
		
		System.out.println("Adding number 1 and number 2");
		ComplexNumber display1 = temp.add(num1 , num2 );
		disp (display1);

		System.out.println("Subtracting number 1 from number 2");
		ComplexNumber display2 = temp.sub(num1 ,num2);
		disp (display2);

		System.out.println("Multiplication of number 1 and number 2");
		ComplexNumber display3 = temp.mul(num1 ,num2);
		disp (display3);

		System.out.println("Dividsion of number 1 and number 2");
		ComplexNumber display4 = temp.divd(num1 ,num2);		
		disp (display4);

	
	}	

}
