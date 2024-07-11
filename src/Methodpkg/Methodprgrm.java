package Methodpkg;

public class Methodprgrm {

	public static void main(String[] args) {
		
		Methodprgrm ob=new Methodprgrm();
		ob.add();
		int value=ob.sub();
		System.out.println("subtrction="+value);
		ob.mul(20, 30);
		double val=ob.div(30, 20);
		System.out.println("division="+val);
		

	}
	
	//1.method without returntype and without parameter
	
	public void add()
	{
		int a=20,b=30,c;
		c=a+b;
		System.out.println(c);
	}
    
	//2.method with returntype and without parameter
	
	public int sub()
	{
		int a=20,b=30,c;
		c=a-b;
		return c;
	}
	
	//3.method without returntype and with parameter
	
	public void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("multiplication="+c);
	}
	
	//4.method with returntype and with parameter
	
	public double div(int a,int b)
	{
		double c=a/b;
		return c;
	}
	
}
