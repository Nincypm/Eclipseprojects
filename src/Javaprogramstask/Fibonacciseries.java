package Javaprogramstask;

public class Fibonacciseries {

	public static void main(String[] args) {

		int n=10, firstterm=0, secondterm=1;
		System.out.println("fibonacci series"+ "");
		 for(int i=0;i<=n;i++)
		 {
			 System.out.println(firstterm+" ");
			   int nextterm = firstterm+secondterm;
			   firstterm=secondterm;
			   secondterm=nextterm;
			   
		 }
	}

}
