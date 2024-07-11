package Javaprogramstask;

class vehicle
{
	public void drive()
	{
		System.out.println("repairing a vehicle");
	}
}

class car extends vehicle
{

	public void drive()
	{
		System.out.println("repairing a car");
	}
}
public class Classmethodcreation {

	public static void main(String[] args) {

		vehicle veh=new vehicle();
		car c=new car();
		veh.drive();
		c.drive();
		
		
		
	}

}
