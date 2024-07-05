package ab30;
class Suni
{
	static void scale()
	{
		System.out.println("i have scale");
	}
	void rubber()
	{
		System.out.println("i have rubber");
	
    }}
abstract class praveen extends Suni
{
	abstract void paper();
	abstract void book();
}
public class Abstract1 extends praveen 
{
  static void add()
   {
	   System.out.println("addition");
   }
    void nib()
  {
	  System.out.println("my nib");
  }
	
	void paper() 
	{
		System.out.println("overidden abstract method1");
		
	}
	
	void book() 
	{
	   System.out.println("overridden abstract method2");	
		
	}
  
  
	public static void main(String[] args) {
	
		Abstract1 a1 = new Abstract1();
		          a1.book();
		          a1.nib();
		          a1.paper();
		          a1.rubber();
		          scale();
		          add();
		          
	}
		
	}
	
		
	

		
	


