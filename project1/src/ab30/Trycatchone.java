package ab30;

public class Trycatchone {

	public static void main(String[] args) {
	String a[]= {"MKT"};
	try
	{
		System.out.println(a[1]);
	}
   catch(ArrayIndexOutOfBoundsException w)
   {
	  System.out.println("just chillax"); 
   }
	finally
	{
		System.out.println("no matter what i will be there");
	}

}}
