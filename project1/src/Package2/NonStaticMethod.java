package Package2;

public class NonStaticMethod {
    void add()
    {
    	System.out.println("banglore");
    }
    void subtraction()
    {
    	System.out.println("india");
    }
	public static void main(String[] args)
	{
		System.out.println("hello");
		
		NonStaticMethod N1= new NonStaticMethod();
		              N1.add();
		              N1.subtraction();
		}
}