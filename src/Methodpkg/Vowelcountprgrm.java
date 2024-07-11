package Methodpkg;

import java.util.Scanner;

public class Vowelcountprgrm {

	public static void main(String[] args) {
     
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Vowelcountprgrm v=new Vowelcountprgrm();
		v.vowelcount(s);
	}
	
	//to print vowel count
	
	public void vowelcount(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
			}
			
		}
		System.out.println("vowelcount="+count);
	}
		

}
