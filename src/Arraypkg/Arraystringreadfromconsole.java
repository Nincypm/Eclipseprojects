package Arraypkg;

import java.util.Scanner;

public class Arraystringreadfromconsole {

	public static void main(String[] args) {

		String[] ar=new String[5];
		System.out.println("enter names");
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<5;i++)
	    {
	    	ar[i]=sc.next();
	    	
	    }
	    System.out.println("entered names:");
	    //for(int i=0;i<5;i++)
	   // {
	    	//System.out.println(ar[i]);
	    	
	    	
	    //}
	    for(String v:ar)
	    	
	    {
	    	System.out.println(v);
	    	
	    }
	}

}
