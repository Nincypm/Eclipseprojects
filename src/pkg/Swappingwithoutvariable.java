package pkg;

public class Swappingwithoutvariable {

	public static void main(String[] args) {

		int a=2,b=6;
		System.out.println("before swapping value of a="+a+"value of b="+b);
		
		a=a+b;//8
		b=a-b;//6
		a=a-b;//2
		System.out.println("after swapping value of a="+a+"value of b="+b);
	}

}
