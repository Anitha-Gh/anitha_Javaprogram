package package3;
class Dog
{
	void mul()
	{
		System.out.println("mul");
	}
}
class Cat 
{
  void sub()
  {
	  System.out.println("sub");
  }
}
class Bat extends Cat
{
	void add()
	{
		System.out.println("add");
	}
}
public class A extends Bat {
void mul()
{
	System.out.println("mul");
}
	public static void main(String[] args) {
		
          Cat c1 = new Bat();//UPCASTING
	           c1.sub();
	          Bat b1 = new A ();//UPCASTING
	            b1.add();
	          A a1 = (A)  b1 ;//DOWNCASTING IS NOT POSSIBLE WITHOUT DOING UPCASTING 
	          a1.mul();
	}

}
