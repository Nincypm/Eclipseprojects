package Javaprogramstask;

import java.util.Scanner;

public class Naturalnumbersum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("sum from:");
		System.out.println("sum upto:");
		int num,sum=0;
		sc.nextInt();
		num=sc.nextInt();
	
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of natural numbers="+sum);
	}

}
