package Controlstatements;

import java.util.Scanner;
public class Scannercalculator {

	public static void main(String[] args) {
		
		Scanner calc=new Scanner(System.in);
		
		
		System.out.println("enter first number");
		 int a=calc.nextInt();
		 System.out.println("enter second number");
		 int b=calc.nextInt();
		 System.out.println("enter our choice:1.Add 2:Sub 3:Mul 4:Div");
		 int choice=calc.nextInt();
		 
		 switch(choice)
		 {
		 case 1:System.out.println(a+b);
			break;
			case 2:System.out.println(a-b);
			break;
			case 3:System.out.println(a*b);
			break;
			case 4:System.out.println(a/b);
			break;
			default:System.out.println("invalid choice");
		 }
		 
	}

}
