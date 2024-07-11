
public class OddorEven {

	public static void main(String[] args) {

		 int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		 System.out.println("Even Numbers:");
		 for (int number : numbers) 
		 {
			 if (number % 2 == 0) 
			 {
				 System.out.println(number + " ");
		     }
		 }

		  System.out.println("Odd Numbers:");
		  for (int number : numbers) 
		  {
			  if (number % 2 != 0) 
			  {
				  System.out.println(number + " ");
		      }
		   }
		    
		

	}

}
