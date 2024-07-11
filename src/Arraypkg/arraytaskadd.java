package Arraypkg;

import java.util.Scanner;

public class arraytaskadd {

	public static void main(String[] args) {

		int[] ar=new int[4];
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<4;i++)
		{
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
		}
		System.out.println("sum= "+sum);
		
	}

}
