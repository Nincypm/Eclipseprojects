package Javaprogramstask;

import java.util.Scanner;

public class Prgrm2 {

	public static void main(String[] args) {

		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		String[] ar=s.split(" ");
		for(String a:ar)
		{
			System.out.println(a);
		}
			System.out.println("wordcount="+ar.length);
	}

}
