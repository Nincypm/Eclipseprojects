package Javaprogramstask;

import java.util.Scanner;

public class Programtask {

	public static void main(String[] args) {

		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(!(s.charAt(i)==' '))
				{
					count++;
				}
					
				
			}
			System.out.println("count of characters="+count);
	}

}
