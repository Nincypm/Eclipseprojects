package Methodpkg;

public class Shapesmethodprgrm {

	public static void main(String[] args) {
		
		Shapesmethodprgrm ob=new Shapesmethodprgrm();
		int value=ob.area();
		System.out.println("area of rectangle="+value);
		int val=ob.areaofsquare();
		System.out.println("area of square="+val);
		double amt=ob.areaofcircle();
		System.out.println("area of circle="+amt);
		double v=ob.areaoftriangle();
		System.out.println("area of triangle="+v);

	}
	
	//area of rectangle
	
	
	public int area()
	{
		int a=10,b=20,c;
		c=a*b;
		return c;
	}
	
	//area of square
	
	public int areaofsquare()
	
	{
	int a=10,c;
	c=a*a;
	return c;
	}
	
	//area of circle
	
	public double areaofcircle()
	{
		double r=10,c;
		c=3.14*r*r;
		return c;
	}
	
	//area of triangle
	
	public double areaoftriangle()
	{
		double b=10,h=15,c;
		c=0.5*b*h;
		return c;
		
	}

}
