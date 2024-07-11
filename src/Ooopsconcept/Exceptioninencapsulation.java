package Ooopsconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptioninencapsulation {

	public static void main(String[] args) throws FileNotFoundException {
		
try
{
		FileInputStream f=new FileInputStream("e://book1.xlsx");
}
catch(FileNotFoundException e)
{
	System.out.println(e.getMessage());
	System.out.println("filenotfoundexception");
}
		
try
{
		int a=10,b=0,c;
		c=a/b;
		System.out.println(c);
}
catch(ArithmeticException div)
{
	System.out.println(div.getMessage());
	System.out.println("Arithmetic exception");
}
System.out.println("hello");
	}

}
