package ab30;
abstract class Mentor
{
	static void help()
	{ 
		System.out.println("");
	}
	
	abstract void knowledge();
	
}
abstract class Student extends Mentor
{
static void add()
{
	System.out.println("addition");
}
abstract void substract();
}
public class Manish1 extends Student {
  void java()
  {
	  System.out.println("learning java");
  }
  static void selenium()
  {
	  System.out.println("Learning selenium");
  }
  void substract()
  {
	  System.out.println("sub");
  }
  void knowledge()
  {
	  System.out.println("knowledge");
  }
  
	public static void main(String[] args) {
		
		Manish1 m1 = new Manish1();
		        m1.knowledge();
		        m1.substract();
		        m1.java();
		        help();
		        add();
		        selenium();
	}
	
		
	}


