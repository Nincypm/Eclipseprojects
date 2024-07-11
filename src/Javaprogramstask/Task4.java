package Javaprogramstask;

public class Task4 {

	public static void main(String[] args) {

		int[] ar=new int[4];
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		
		int max=ar[0];
		
		for(int i=0;i<4;i++)
		{
			if(ar[i]>max) max=ar[i];
			
		}
		
		System.out.println("largest element="+max);
	}

}
