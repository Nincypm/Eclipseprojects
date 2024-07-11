import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		 
		String s = "nincy";
		char[] ar = s.toCharArray();
		for (int i = ar.length - 1; i >= 0; i--) 
		{
			System.out.print(ar[i]);
		}
			
	}

}
