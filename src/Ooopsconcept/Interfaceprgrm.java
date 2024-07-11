package Ooopsconcept;


interface Car
{
	void acceleration();
	void speedlimit();
}

class Maruti implements Car
{

	@Override
	public void acceleration() {

		System.out.println("Maruti acceleration");
	}

	@Override
	public void speedlimit() {

		System.out.println("Maruti speedlimit");
	}
	
}
class Mahindra implements Car
{

	@Override
	public void acceleration() {

		System.out.println("Mahindra acceleration");
	}

	@Override
	public void speedlimit() {

		System.out.println("Mahindra speedlimit");
	}
	
}
public class Interfaceprgrm {

	public static void main(String[] args) {

		Maruti ob=new Maruti();
		ob.acceleration();
		ob.speedlimit();
		Mahindra ob1=new Mahindra();
		ob1.acceleration();
		ob1.speedlimit();
	}

}
