package Ooopsconcept;

public class Polymorphismprogrm {

	public static void main(String[] args) {
     Polymorphismprogrm ob=new Polymorphismprogrm();
     ob.add();
     ob.add(2, 3);
     ob.add(2.5, 5);
     ob.add(4, 4.3);
     
		
	}

	
	public void add()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}
	//by changing number of arguments
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("c="+c);
	}
	//by changing type of arguments
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println("c="+c);
	}
	//by changing order of arguments
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println("c="+c);
	}
}
