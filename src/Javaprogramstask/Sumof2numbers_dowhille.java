package Javaprogramstask;

import java.util.Scanner;

public class Sumof2numbers_dowhille {

	public static void main(String[] args) {

		int sum=0;
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		i=sc.nextInt();
		
		do
		{
			sum+=i;
	
			
		}while(i>=0);
		System.out.println("sum="+sum);
		
		
	}

}
