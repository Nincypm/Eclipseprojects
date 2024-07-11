package Constructorprgrm;

public class Studentdetails {
	
	int stdid;
	String studentname;
	String department;
	
	
	public Studentdetails(int stdid,String studentname,String department)
	{
		this.stdid=stdid;
		this.studentname=studentname;
		this.department=department;
	}

	public static void main(String[] args) {

		Studentdetails st=new Studentdetails(01,"nincy","computer science");
		
		System.out.print(st.stdid);
		System.out.println(st.studentname);
		System.out.println(st.department);

	}
     
}
