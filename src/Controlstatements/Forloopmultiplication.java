package Controlstatements;

public class Forloopmultiplication {

	public static void main(String[] args) {

		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"*5="+(i*5));
			
		}
		
		
		//factorial
		int a=5;
		int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;//1=1*1   1=1*2  2=2*3   
			
			System.out.println("factorial="+fact);
			
			
		}
	}

}
