package Controlstatements;

public class Calculatorswitchstmnt {

	public static void main(String[] args) {


	
		int a=4, b=2;
	    char choice='%';
	    		
		switch(choice)
		{
		case '+':System.out.println("sum="+(a+b));
		break;
		case '-':System.out.println("sub="+(a-b));
		break;
		case '*':System.out.println("mult="+(a*b));
		break;
		case '/':System.out.println("div="+(a+b));
		break;
		case '%':System.out.println("remndr="+(a%b));
		break;
		default:System.out.println("invalid choice");
		
		}
		
	}

}
