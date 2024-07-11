package Stringpkg;

public class Stringprgrms {

	public static void main(String[] args) {

		String s1="hello";
		String s2="welcome";
		String s3= new String("Hello");
		String s4= new String("hi welcome to Luminar");
		String s5="   nincy pm   ";
		
	
				
	//concat
				
				System.out.println(s1.concat(s2));
				System.out.println(1+2+s1+3+4);
				
				
   //equals
				System.out.println(s1==s3);
				System.out.println(s1.equals(s3));
				System.out.println(s1.equalsIgnoreCase(s3));
	//length
				System.out.println(s1.length());
	
				
	//tolowercase
				System.out.println(s3.toLowerCase());
    //touppercase
				System.out.println(s1.toUpperCase());
				
	//startswith
				System.out.println(s4.startsWith("hi"));
	//endswith
				System.out.println(s4.endsWith("Luminar"));
				
	//trim
				System.out.println(s5.trim());
				
	//replace
				System.out.println(s4.replace("hi", "hello"));
				
				
	//contains
				System.out.println(s5.contains("nincy"));
				
	//split
				String[] ar=s4.split(" ");
				for(String a:ar)
				{
					System.out.println(a);
				}
				
				
	//substring
				System.out.println(s2.substring(2,6));
				
				
    //charAt
				System.out.println(s1.charAt(3));
				
	//tocharArray
				
				char[] c=s1.toCharArray();
				for(char c1:c)
				{
					System.out.println(c1);
				}
				
	}

}
