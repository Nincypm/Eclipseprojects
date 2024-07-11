package Controlstatements;

import java.util.Scanner;

public class Calculatordowhile {

	public static void main(String[] args) {
		
		int a,b,ans;
		char choice;
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("calculatorProgram");
			
			System.out.println("enter your choice: ");
			choice=sc.next().charAt(0);
		
		switch(choice)
		{
		case '+':System.out.println("enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		ans=a+b;
		System.out.println("sum="+ans);
		break;
		case '-':System.out.println("enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		ans=a-b;
		System.out.println("sub="+ans);
		break;
		case '*':System.out.println("enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		ans=a*b;
		System.out.println("mul="+ans);
		break;
		case '/':System.out.println("enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		ans=a/b;
		System.out.println("div="+ans);
		break;
		case '%':System.out.println("enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		ans=a%b;
		System.out.println("rem="+ans);
		break;
		default:System.out.println("invalid choice");
		
		}
		}
		
		while(choice!='%');
			
		
	}

}
