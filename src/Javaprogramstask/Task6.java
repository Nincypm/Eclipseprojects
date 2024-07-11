package Javaprogramstask;

public class Task6 {

	public static void main(String[] args) {

		
		int ar[]={1,2,3,4,5,6};
		int n=ar.length;
		int counteven=0, countodd=0;
		
		for(int i=0;i<n;i++)
		{
			if((ar[i]%2)==0)
			counteven +=1;
			
			else
				countodd +=1;
			
		}
		System.out.println("even numbercount: "+counteven);
		System.out.println("even numbercount: "+countodd);
	}

}
