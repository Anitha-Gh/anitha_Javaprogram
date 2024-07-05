package basic_program_ab42;
class concretclass
{
	static void lion()
	{
		System.out.println("i am having lion");
	}
	void tiger()
	{
		System.out.println("i love tiger");
	}
}
abstract class dog
{
	abstract void dog();
}
abstract class pig extends dog
{
	abstract void pig();
	
}
 class concret2 extends pig 
 {
	  static void mul()
	  {
		  System.out.println("i am mul");
	  }
	  static void div()
	  {
		  System.out.println("i am div");
	  }
	@Override
	void pig() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void dog() {
		// TODO Auto-generated method stub
		
	}
 }
public class Abstract_Assignment_Program extends concret2
{
     static void deer()
     {
    	 System.out.println("i am deer");
     }
     static void petdeer()
     {
    	 System.out.println("i love pet_deer");
     }
	public static void main(String[] args) {
         mul();
         div();
         deer();
         petdeer();
         Abstract_Assignment_Program a1 = new Abstract_Assignment_Program();
                 a1.dog();
	}

}
