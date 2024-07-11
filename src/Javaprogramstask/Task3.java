package Javaprogramstask;

public class Task3 {

	public static void main(String[] args) {

		String s="malayalam";
		
		String rev="";
		
		
		for(int i=s.length()-1;i>=0;i--)
			
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("paliandrome");
		}
		else
		{
			System.out.println("not a paliandrome");
		}
	}

}
