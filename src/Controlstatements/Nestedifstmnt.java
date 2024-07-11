package Controlstatements;
public class Nestedifstmnt {

	public static void main(String[] args) {
        int age=18,weight=55;
		if(age>=18)
		{
			if(weight>55)
			{
				System.out.println("eligilble for blood donation");
			}
			else 
			{
				System.out.println("not eligible:minimum weight is 55");
			}
		}
		else
		{
			System.out.println("not eligible");
		
		}
			
	}

}
