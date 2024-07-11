package Javaprogramstask;

public class Task1 {

	public static void main(String[] args) {

		String s="Testing Training Center";
		
		String[] st=s.split(" ");
		
		for(int i=st.length-1;i>=0;i--)
		{
		System.out.print(st[i]+" ");
		
		}                     

	}

}
