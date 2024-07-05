package basic_program_ab42;

public class This_Calling_Program1 {
	This_Calling_Program1(int a)
	{
		System.out.println("1");
	}
	This_Calling_Program1(int a,int b)
	{
		this(125);
		System.out.println("2");
	}
	This_Calling_Program1(int a,int b,double d)
	{
		this(100,200);
		System.out.println("3");
	}
	public static void main(String[] args) {
		
		new This_Calling_Program1 (1234,2345,3.14);
	}

}
