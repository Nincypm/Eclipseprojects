package Arraypkg;

import java.util.Scanner;

public class Multidimensionalarray {

	public static void main(String[] args) {

		int[][] ar=new int[3][4];
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("entered numbers:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}
		
	}

}
