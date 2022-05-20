/*
 * Demonstrate the working with multiple interfaces.
 */
package demo2;

 abstract class PlaneBasicFunction
{
	 abstract void PlaneName();

	 final void TakeOff()
	 {
			System.out.println("Plane Take Off");

	 }
	final void Land()
	 {
			System.out.println("Plane Land");

	 }
	 
}
 
interface PlaneSpecialFunction1
{
	void Height();
}
interface PlaneSpecialFunction2
{
	void Carry();
}

class CargoPlane extends PlaneBasicFunction implements PlaneSpecialFunction1,PlaneSpecialFunction2
{
	void PlaneName()
	{
		System.out.println("Cargo Plane: ");

	}
	public void Height()
	{
		System.out.println("Fly at low height");
	
	}
	public void Carry()
	{
		System.out.println("Carries cargo" + '\n');

	}
}

class PassengerPlane extends PlaneBasicFunction implements PlaneSpecialFunction1,PlaneSpecialFunction2
{
	void PlaneName()
	{
		System.out.println("Passenger Plane: ");

	}
	public void Height()
	{
		System.out.println("Fly at medium height");
	
	}
	public void Carry()
	{
		System.out.println("Carries passenger" + '\n');

	}
}



public class MultipleInterface {
	public static void main(String[] args)
	{
	
	// PlaneBasicFunction plane1 = new CargoPlane();
	
	CargoPlane plane1 = new CargoPlane();
	plane1.PlaneName();
	plane1.TakeOff();
	plane1.Land();
	plane1.Height();
	plane1.Carry();

	PassengerPlane plane2 = new PassengerPlane();
	plane2.PlaneName();
	plane2.TakeOff();
	plane2.Land();
	plane2.Height();
	plane2.Carry();
	
	
	}
	

}
