package Javaprogramstask;

import java.util.Scanner;

public class prgramtask3sumofdigits {

	public static void main(String[] args) {

		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long num,sum;
		
		for(sum=0;n!=0;n=n/10) {
			sum=sum+n%10;
			
		}
		System.out.println("sumofdigits="+sum);
	}

}
