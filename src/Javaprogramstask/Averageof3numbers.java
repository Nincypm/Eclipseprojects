package Javaprogramstask;

import java.util.Scanner;

public class Averageof3numbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number : ");
		int a=sc.nextInt();
		System.out.println("enter second number : ");
		int b=sc.nextInt();
		System.out.println("enter third number : ");
		int c=sc.nextInt();
		
		System.out.println("Average= "+ avr(a,b,c));
	
	}
	

	public static int avr(int a,int b,int c)
	{
		return (a+b+c)/3;
	}
}
