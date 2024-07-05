package basic_program_ab42;
abstract class add
{
	abstract void add();
}
abstract class sub extends add
{
	abstract void sub();
}
public class Abstract_Class extends sub
{    static void add1()
	{
	  System.out.println("i am writing program");
	}
     void sub1()
     {
    	 System.out.println("i am doing abstract program");
     }
	public static void main(String[] args) {
	
		Abstract_Class a1 = new Abstract_Class ();
		      a1.add1();
		      a1.sub1();
	}
	@Override
	void sub() {
		
		
	}
	@Override
	void add() {
		
		
	}

}
