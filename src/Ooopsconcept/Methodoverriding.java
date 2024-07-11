package Ooopsconcept;


class shape
{
	public void draw()
	{
		System.out.println("draw any shape");
		
	}
}
 class circle extends shape
 {
	 public void draw()
	 {
		 System.out.println("shape is square");
		 super.draw();
	 }
 }
public class Methodoverriding {
	



	public static void main(String[] args) {
		
		circle ob=new circle();
		ob.draw();
		
	}

}
