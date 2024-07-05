package ab30;
interface Wild
{
	void lion();
	void tiger();
}
interface Animal 
{
	void mouse();
	void rat();
}
abstract class Pet implements Animal,Wild
{
	abstract void pet1();
	abstract void pet2();
}
public class Interface_Assignment extends Pet{
     static void talk()
     {
    	 System.out.println("talking");
     }
     void speak()
     {
    	 System.out.println("speaking");
     }
	public static void main(String[] args) {
	
		Interface_Assignment n1 =new Interface_Assignment();
		              talk();
		              n1.lion();
		              n1.mouse();
		              n1.pet1();
		              n1.pet2();
		              n1.rat();
		              n1.speak();
		              n1.tiger();
	}
	
	public void mouse() 
	{
		System.out.println("mouse");
		
	}
	
	public void rat() 
	{
		
		System.out.println("rat");
	}
	
	public void lion() 
	{
	
		System.out.println("lion");
	}
	
	public void tiger() 
	{
		System.out.println("tiger");
		
	}
	
	void pet1() 
	{
		System.out.println("pet1");
		
	}
	
	void pet2() 
	{
		System.out.println("pet2");
		
	}

}
