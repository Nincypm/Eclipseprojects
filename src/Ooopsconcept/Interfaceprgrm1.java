package Ooopsconcept;

class Monkey
{
   public void jump()
   {
	   System.out.println("monkey jump");
   }
	public void bite()
	{
		System.out.println("monkey jump");
	}
}
interface Basicanimal
{
	void eat();
	void sleep();
}
class Human extends Monkey implements Basicanimal
{
	void speak()
	{
		System.out.println("speaking");
	}

	@Override
	public void eat() {

		System.out.println("human monkey eatables");
	}

	@Override
	public void sleep() {

		System.out.println("human monkey sleep");
	}
	
}
public class Interfaceprgrm1 {

	public static void main(String[] args) {

		Human ob=new Human();
		ob.sleep();
		
	}

}
