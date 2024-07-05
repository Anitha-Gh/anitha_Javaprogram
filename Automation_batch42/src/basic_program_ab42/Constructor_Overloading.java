package basic_program_ab42;

public class Constructor_Overloading {

	Constructor_Overloading()
	{
		System.out.println("i have non parameterised constructer");
	}
	Constructor_Overloading(int a)
	{
		
		System.out.println("i am having parameter");
	}
	Constructor_Overloading(int a,int b)
	{
	   
		System.out.println("i am having double parameter");
	}
	Constructor_Overloading(int a,int b,boolean f)
	{
		
		System.out.println("i am 4th parameter");
	}
	
	public static void main(String[] args) {
		
		Constructor_Overloading c1 = new Constructor_Overloading();
		Constructor_Overloading c2 = new Constructor_Overloading(100);  
		Constructor_Overloading c3 = new Constructor_Overloading(200,300);
		Constructor_Overloading c4 = new Constructor_Overloading(10,20,true);
		
	}

}
