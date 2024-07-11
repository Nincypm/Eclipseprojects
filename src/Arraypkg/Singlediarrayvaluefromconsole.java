package Arraypkg;

import java.util.Scanner;

public class Singlediarrayvaluefromconsole {

	public static void main(String[] args) {

		int[] arr=new int[4];
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("entered numbers:");
		for(int i=0;i<4;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
