package package3;
abstract class Mangalore
{	abstract void add();
	
}
public class Banglore extends Mangalore
{
	void add() 
	{
		System.out.println("I have overcomed my fear of abstract");
	}
	public static void main(String[] args) 
	{
		Banglore b1=new Banglore();
		b1.add();
	}



}
