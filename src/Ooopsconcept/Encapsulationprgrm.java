package Ooopsconcept;

class Employee
{
	private int empid;
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	
}
public class Encapsulationprgrm {

	public static void main(String[] args) {

		Employee ob=new Employee();
		ob.setEmpid(100);
		ob.setEmpname("vishnu");
		System.out.println(ob.getEmpid());
		System.out.println(ob.getEmpname());
	}

}
