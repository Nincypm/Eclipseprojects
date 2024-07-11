
public class DuplicateElements {

	public static void main(String[] args) {

		 int [] num = new int [] {2, 4, 6, 8, 4, 6, 10, 10};
		 System.out.println("Duplicate elements in given array are: ");
		 for(int i=0;i<num.length;i++) 
		 {
		      for(int j=i+1;j<num.length;j++) 
		      {
		        if(num[i]==num[j])
		        {
		          System.out.println(num[j]);
		        }
		      }
		 }
	}

}
