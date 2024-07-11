package Ooopsconcept;

import java.util.Scanner;

interface Bank
{
	void Accountdetails();
	void Balance();
	void Withdrawalamount();
	void Depositamount();
}

class HDFC implements Bank
{

	Scanner sc=new Scanner(System.in);
	static String bankname="HDFC";
	String acntholdername;
	long accntno;
	int balance=1000;
	@Override
	public void Accountdetails() {

		System.out.println("Accountdeatils:");
		System.out.println("enter your accntno :");
		long accntno=sc.nextLong();
		System.out.println("account num is "+" "+accntno);
		System.out.println("enter your name");
		String acntholdername=sc.next();
		System.out.println("entered name is "+" "+acntholdername);
		System.out.println("branchname");
		String branch=sc.next();
		System.out.println("branch name is"+" "+branch);
	}

	@Override
	public void Balance() {

		System.out.println("check balance");
		String response=sc.next();
		if (response.equals("yes"))
		{
			System.out.println("balance"+" "+balance);
		}
		else 
		{
			System.out.println("next");
		}
	}

	@Override
	public void Withdrawalamount() {

	System.out.println("money withdrawal");
	String rspnse=sc.next();
	if(rspnse.equals("yes"))
	{
		System.out.println("enter amount");
		long withdrawalamnt=sc.nextLong();
		System.out.println("withdrawal amount is "+" "+withdrawalamnt);
		System.out.println("your current balance is "+" "+(balance-withdrawalamnt));
	}
		else{
			System.out.println("next");
		}
	
	
	}

	@Override
	public void Depositamount() {

		System.out.println("deposit amount");
		String rspnse2=sc.next();
		if(rspnse2.equals("proceed"))
		{
			System.out.println("enter amount");
			long deposit=sc.nextLong();
			System.out.println("your current balance is "+" "+(deposit+balance));
			System.out.println("Thankyou");
		}
		else {
			System.out.println("thankyou");
		}
	}
	
}
public class InterfaceBankingapplication {

	
	public static void main(String[] args) {

		HDFC ob=new HDFC();
		ob.Accountdetails();
		ob.Balance();
		ob.Withdrawalamount();
		ob.Depositamount();
		}
	

}
