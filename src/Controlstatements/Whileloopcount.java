package Controlstatements;

public class Whileloopcount {

	public static void main(String[] args) {

		int count=0, num=1234;
		while (num>0)
		{
			num=num/10;
			count++;
		}
			System.out.println("no of digits= "+count);
	}

}
