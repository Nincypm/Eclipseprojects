package Javaprogramstask;

public class Positivenegativezero {

	public static void main(String[] args) {

		int a,b,c;
		a=b=c=0;
		int arr[]= {2,-3,0,0,-1,5,6,7,-6,-5};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
				a++;
			else if(arr[i]<0)
				b++;
			else
				c++;
		}
		System.out.println("positive numbers count="+a);
		System.out.println("negative numbers count="+b);
		System.out.println("zeroes count="+c);
		
	}

}
