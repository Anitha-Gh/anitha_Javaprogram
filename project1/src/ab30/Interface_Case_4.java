package ab30;
interface selenium
{
	void selenium1();
	void selenium2();
}
interface java
{
	void java1();
	void java2();
}

public class Interface_Case_4 implements java,selenium
{
	public void selenium1() 
	{
		System.out.println("selenium1");
	}

	public void selenium2() 
	{
		System.out.println("selenium2");
		
	}
    public void java1() 
    {
    	System.out.println("java1");
		
	}
    public void java2() 
    {
		
		System.out.println("java2");
	}


	public static void main(String[] args) {
		Interface_Case_4 int1 = new Interface_Case_4();
		       int1.selenium1();
		       int1.selenium2();
		       int1.java1();
		       int1.java2();

	}

	
}
