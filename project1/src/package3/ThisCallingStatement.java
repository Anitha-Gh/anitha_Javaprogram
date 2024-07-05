package package3;

 //This calling statement is used to calling one constructor to another constructor is called this calling statement//
  
   public class ThisCallingStatement
   {
	
	ThisCallingStatement(String a,char b)
	{
		System.out.println("1");
	}
	ThisCallingStatement(double b,double c)
	{
		this("Manish",'M');
	System.out.println("2");
	}
	ThisCallingStatement(int a)
	{
		this (3.14,2.14);
		System.out.println("3");
	}
	public static void main(String[] args) {
	         new ThisCallingStatement(15);

	}

}
